package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import section22_database.e_jpa.music.Artist;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCriteriaBuilder {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("section22_database.e_jpa.music");
             EntityManager em = emf.createEntityManager()) {
            var transaction = em.getTransaction();
            transaction.begin();
            Stream<Artist> artists = getArtistsBuilder(em, "Bl%");
            var nameCount = artists.limit(10).collect(Collectors.toMap(
                    Artist::getArtistName, a -> a.getAlbums().size(), Integer::sum, TreeMap::new
            ));
            nameCount.forEach((k, v) -> System.out.println(k + " : " + v));
            //Hibernate: select a1_0.artist_id,a1_0.artist_name from artists a1_0 where a1_0.artist_name like ? escape '' order by a1_0.artist_name
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
    public static Stream<Artist> getArtistsBuilder(EntityManager em, String matchedValue) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Artist> criteriaQuery = builder.createQuery(Artist.class);
        Root<Artist> root = criteriaQuery.from(Artist.class);
        criteriaQuery.select(root)
                .where(builder.like(root.get("artistName"), matchedValue))
                .orderBy(builder.asc(root.get("artistName")));
        return em.createQuery(criteriaQuery).getResultStream();
    }
}
