package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import section22_database.e_jpa.music.Album;
import section22_database.e_jpa.music.Artist;
import section22_database.e_jpa.music.Song;

import java.util.List;
import java.util.stream.Stream;

public class SongCriteriaBuilder {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("section22_database.e_jpa.music");
             EntityManager em = emf.createEntityManager()) {
            var transaction = em.getTransaction();
            transaction.begin();

            String word = "Storm";

            System.out.printf("%-25s %-35s %s%n", "Artist", "Album", "Song Title");
            var bmatches = getMatchedSongsBuilder(em,
                    word + "%");
            bmatches.forEach(m ->
                    System.out.printf("%-25s %-35s %s%n",
                            (String) m[0], (String) m[1], (String) m[2])
            );
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

    private static List<Object[]> getMatchedSongsBuilder(EntityManager entityManager,
                                                         String matchedValue) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);

        Root<Artist> root = query.from(Artist.class);
        Join<Artist, Album> albumJoin = root.join("albums", JoinType.INNER);
        Join<Album, Song> songJoin = albumJoin.join("songs", JoinType.INNER);

        query
                .multiselect(
                        root.get("artistName"),
                        albumJoin.get("albumName"),
                        songJoin.get("songTitle")
                )
                .where(builder.like(songJoin.get("songTitle"), matchedValue))
                .orderBy(builder.asc(root.get("artistName")));

        return entityManager.createQuery(query).getResultList();
    }
}
