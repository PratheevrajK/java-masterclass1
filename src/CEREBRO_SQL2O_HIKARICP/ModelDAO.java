package CEREBRO_SQL2O_HIKARICP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sql2o.Connection;

public class ModelDAO {

    private static final Logger logger = LoggerFactory.getLogger(ModelDAO.class);

    public static void createModelTable(Connection connection) {
        String sql = "CREATE TABLE IF NOT EXISTS MODEL_TABLE " +
                "(" +
                "model_id varchar(100) REFERENCES METADATA_TABLE (model_id) ON DELETE CASCADE," +
                "attribute text," +
                "attribute_type varchar(50)," +
                "PRIMARY KEY (model_id, attribute)" +
                ");";
        connection.createQuery(sql).executeUpdate();
    }
}