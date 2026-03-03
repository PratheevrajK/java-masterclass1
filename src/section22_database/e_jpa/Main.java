package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import section22_database.e_jpa.music.Artist;

//Modify run configuration -> Modify classpath to include META-INF folder location.
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try (var sessionFactory = Persistence.createEntityManagerFactory("section22_database.e_jpa.music"); // Entity package path goes here
             EntityManager entityManager = sessionFactory.createEntityManager()) {
            var transaction = entityManager.getTransaction(); // we can use transaction to test and rollback our changes.
            transaction.begin();
            Artist artist = new Artist("Muddy Water");
            entityManager.persist(artist);
            transaction.commit();
        } catch (Exception e) {
            log.error("e: ", e);
        }
    }
}
