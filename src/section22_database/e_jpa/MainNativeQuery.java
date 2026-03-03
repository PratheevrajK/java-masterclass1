package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import section22_database.e_jpa.music.Artist;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainNativeQuery {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("section22_database.e_jpa.music");
             EntityManager em = emf.createEntityManager()) {
            var transaction = em.getTransaction();
            transaction.begin();
            Stream<Artist> artists = getArtistsSQL(em, "Bl%");
            var nameCount = artists.limit(10).collect(Collectors.toMap(
                    Artist::getArtistName, a -> a.getAlbums().size(), Integer::sum, TreeMap::new
            ));
            nameCount.forEach((k, v) -> System.out.println(k + " : " + v));
            //Hibernate: SELECT * FROM music.artists where artist_name like ?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
            //Black Crowes : 2
            //Black Keys : 8
            //Black Oak Arkansas : 2
            //Black River Project : 2
            //Black Sabbath : 36
            //Blackbeard's Tea Party : 6
            //Blaster Bates : 4
            //Blue Öyster Cult : 20
            transaction.commit();
        }
    }
    public static Stream<Artist> getArtistsSQL(EntityManager em, String matchedValue) {
        String sql = "SELECT * FROM music.artists where artist_name like ?1";
        var query = em.createNativeQuery(sql, Artist.class);
        query.setParameter(1, matchedValue);
        return query.getResultStream();
    }
}
