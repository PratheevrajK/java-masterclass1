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

            // Insert - adds the artist to managed state
//            Artist artist = new Artist("Muddy Water");
//            entityManager.persist(artist);

            // Select an artist(managed state) and update.
//            Artist artist = entityManager.find(Artist.class, 204);
//            System.out.println(artist);
//            artist.setArtistName("Muddy Watersss"); // this line would update data in the DB.

            // Update an artist(makes the entity a managed one first.)
//            entityManager.merge(new Artist(204, "Muddy Water merge"));

            // Delete - Removes the entity from managed state and deletes the record.
//            entityManager.remove(artist);

            Artist artist = entityManager.find(Artist.class, 201);
            System.out.println(artist);
//            artist.removeDuplicates();
            artist.addAlbum("The Best of Muddy Waters");
            System.out.println(artist);
            transaction.commit();
        } catch (Exception e) {
            log.error("e: ", e);
        }
    }
}
