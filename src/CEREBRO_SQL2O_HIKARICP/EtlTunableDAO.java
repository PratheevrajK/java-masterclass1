package CEREBRO_SQL2O_HIKARICP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

import java.util.List;

public class EtlTunableDAO {

    static Sql2o sql2o = new Sql2o(""); // dummy setup
    private static final Logger logger = LoggerFactory.getLogger(EtlTunableDAO.class);

    public static void createTunableTable() {
        String sql = "CREATE TABLE IF NOT EXISTS TABLE_NAME " +
                "(key        varchar(100) NOT NULL," +
                "value       text NOT NULL," +
                "updated_by  varchar(50) NOT NULL," +
                //job_data   jsonb,
                "PRIMARY KEY (key));" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS HISTORY_TABLE_NAME " +
                "(operation  char(1) NOT NULL," +
                "stamp       timestamptz NOT NULL," +
                "userid      varchar(50) NOT NULL," +
                "key         varchar(100) NOT NULL," +
                "value       text NOT NULL," +
                "updated_by  varchar(50) NOT NULL);" +
                "\n" +
                "CREATE OR REPLACE FUNCTION process_tunable_audit() RETURNS TRIGGER AS $tunable_audit" +
                "   BEGIN" +
                "       IF (TG_OP = 'DELETE') THEN" +
                "           INSERT INTO HISTORY_TABLE_NAME SELECT 'D', now(), user, OLD.*;" +
                "           RETURN OLD;" +
                "       ELIF (TG_OP = 'UPDATE') THEN" +
                "           INSERT INTO HISTORY_TABLE_NAME SELECT 'U', now(), user, NEW.*;" +
                "           RETURN NEW;" +
                "       ELIF (TG_OP = 'INSERT') THEN" +
                "           INSERT INTO HISTORY_TABLE_NAME SELECT 'I', now(), user, NEW.*;" +
                "           RETURN NEW;" +
                "       END IF;" +
                "           RETURN NULL;" +
                "   END;" +
                "\n" +
                "$tunable_audit LANGUAGE plpgsql;" +
                "CREATE TRIGGER tunable_audit" +
                "AFTER INSERT OF UPDATE OR DELETE ON TABLE_NAME " +
                "   FOR EACH ROW EXECUTE PROCEDURE process_tunable_audit();" +
                "\n" +
                "CREATE INDEX IF NOT EXISTS INDEX_NAME " +
                "ON TABLE_NAME (key);";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(sql).executeUpdate();
        } catch (java.lang.Exception e) {
            logger.error("Exception: ", e);
        }
    }

    public static List<Tunable> getTunable(String key) {
        String query = "SELECT * FROM TABLE_NAME WHERE key = :key;";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .addParameter("key", key)
                    .executeAndFetch(Tunable.class);
        } catch (java.lang.Exception e) {
            logger.error("Exception: ", e);
            throw e;
        }
    }

    public static void insertTunable(Tunable tunable) {
        String query = "INSERT INTO TABLE_NAME (key, value, updated_by) VALUES (:key, :value, :updatedBy);";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .bind(tunable)
                    .executeUpdate();
        } catch (java.lang.Exception e) {
            logger.error("Exception: ", e);
            throw e;
        }
    }

    //Batch insert/update
    public static void insertTunables(Connection connection, List<Tunable> tunables) {
        String sql = "INSERT INTO TABLE_NAME (key, value, updated_by) VALUES (:key, :value, :updatedBy);";
        Query query = connection.createQuery(sql);
        for (Tunable tunable : tunables) {
            query.bind(tunable).addToBatch();
        }
        query.executeUpdate();
    }
}

record Tunable (String key, String value, String updated_by) {

}