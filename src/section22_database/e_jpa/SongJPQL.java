package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import section22_database.e_jpa.music.Artist;

import java.util.stream.Stream;

public class SongJPQL {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("section22_database.e_jpa.music");
             EntityManager em = emf.createEntityManager()) {
            var transaction = em.getTransaction();
            transaction.begin();

            var stream = getArtists(em, "Storm%");

            System.out.printf("%-15s %-20s %s%n", "ArtistName", "AlbumName", "SongTitle");
            stream.forEach(t -> {
                System.out.printf("%-15s %-20s %s%n", t.get(0), t.get(1), t.get(2));
            });
            //ArtistName      AlbumName            SongTitle
            //Ted Nugent      Ted Nugent           Stormtroopin' (Live At Hammersmith Odeon London 1977)
            //Deep Purple     Stormbringer         Stormbringer
            //Deep Purple     Made In Europe       Stormbringer
            //Ted Nugent      Ted Nugent           Stormtroopin'

            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static Stream<Tuple> getArtists(EntityManager em, String matchValue) {
        var query = em.createQuery("SELECT art.artistName, alb.albumName, s.songTitle from Artist art " +
                "JOIN albums alb " +
                "JOIN songs s " +
                "WHERE s.songTitle LIKE :matchValue", Tuple.class);
        query.setParameter("matchValue", matchValue);
        return query.getResultStream();
    }
}
