package section22_database.e_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import section22_database.e_jpa.music.Artist;

import java.util.List;
import java.util.stream.Stream;

public class MainJPQL {
    public static void main(String[] args) {
        List<Artist> artists = null;
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("section22_database.e_jpa.music");
                EntityManager em = emf.createEntityManager()) {
            var transaction = em.getTransaction();
            transaction.begin();
//            artists = getArtistsJPQL(em, "%Stev%");
//            artists.forEach(System.out::println);
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=61, artistName='Steve Vai', albums='[Album{albumId=165, albumName='Sex & Religion'}, Album{albumId=604, albumName='Sex & Religion'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=170, artistName='Steve Harley & Cockney Rebel', albums='[Album{albumId=277, albumName='Live and Unleashed'}, Album{albumId=716, albumName='Live and Unleashed'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=173, artistName='Steve Hillage', albums='[Album{albumId=219, albumName='Motivation Radio'}, Album{albumId=658, albumName='Motivation Radio'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=175, artistName='Seasick Steve', albums='[Album{albumId=256, albumName='Walkin' Man The Best of Seasick Steve'}, Album{albumId=436, albumName='Man From Another Time'}, Album{albumId=695, albumName='Walkin' Man The Best of Seasick Steve'}, Album{albumId=875, albumName='Man From Another Time'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=180, artistName='Steve Hackett', albums='[Album{albumId=222, albumName='Voyage of the Acolyte'}, Album{albumId=243, albumName='Please Don't Touch!'}, Album{albumId=661, albumName='Voyage of the Acolyte'}, Album{albumId=682, albumName='Please Don't Touch!'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=200, artistName='Stevie Ray Vaughan', albums='[Album{albumId=373, albumName='Collections'}, Album{albumId=812, albumName='Collections'}]'}

//            Stream<Tuple> tuples = getArtistNames(em, "%Stev%");
//            tuples
//                    .map(a -> new Artist(a.get("id", Integer.class), a.get("name", String.class)))
//                    .forEach(System.out::println);
//            Artist{artistId=61, artistName='Steve Vai', albums='[]'}
//            Artist{artistId=170, artistName='Steve Harley & Cockney Rebel', albums='[]'}
//            Artist{artistId=173, artistName='Steve Hillage', albums='[]'}
//            Artist{artistId=175, artistName='Seasick Steve', albums='[]'}
//            Artist{artistId=180, artistName='Steve Hackett', albums='[]'}
//            Artist{artistId=200, artistName='Stevie Ray Vaughan', albums='[]'}

            artists = getArtistsByAlbumName(em, "Greatest Hits%");
            artists.forEach(System.out::println);
//            Hibernate: select a1_0.artist_id,a1_0.artist_name from artists a1_0 join albums a2_0 on a1_0.artist_id=a2_0.artist_id where a2_0.album_name like ? escape ''
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=198, artistName='Tom Petty & The Heartbreakers', albums='[Album{albumId=47, albumName='Greatest Hits'}, Album{albumId=486, albumName='Greatest Hits'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=92, artistName='Fleetwood Mac', albums='[Album{albumId=41, albumName='The Dance'}, Album{albumId=232, albumName='The Very Best Of'}, Album{albumId=238, albumName='Greatest Hits'}, Album{albumId=324, albumName='The Best of'}, Album{albumId=416, albumName='Rumours'}, Album{albumId=480, albumName='The Dance'}, Album{albumId=671, albumName='The Very Best Of'}, Album{albumId=677, albumName='Greatest Hits'}, Album{albumId=763, albumName='The Best of'}, Album{albumId=855, albumName='Rumours'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=188, artistName='Billy Joel', albums='[Album{albumId=345, albumName='Greatest Hits Vol. III'}, Album{albumId=784, albumName='Greatest Hits Vol. III'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=176, artistName='Billy Idol', albums='[Album{albumId=399, albumName='Greatest Hits'}, Album{albumId=838, albumName='Greatest Hits'}]'}
//            Hibernate: select a1_0.artist_id,a1_0.album_id,a1_0.album_name from albums a1_0 where a1_0.artist_id=?
//                    Artist{artistId=153, artistName='Troggs', albums='[Album{albumId=46, albumName='Athens Andover'}, Album{albumId=97, albumName='Wild Thing - The Greatest Hits'}, Album{albumId=422, albumName='Greatest Hits'}, Album{albumId=485, albumName='Athens Andover'}, Album{albumId=536, albumName='Wild Thing - The Greatest Hits'}, Album{albumId=861, albumName='Greatest Hits'}]'}

            transaction.commit();
        }
    }
    public static List<Artist> getArtistsJPQL(EntityManager em, String matchedValue) {
        String jpql = "SELECT a FROM Artist a WHERE a.artistName LIKE :partialName"; //Artist refers Entity and not the table, also artistName is the field in Artist not column name.
        var query = em.createQuery(jpql, Artist.class);
        query.setParameter("partialName", matchedValue);
        return query.getResultList();
    }
    public static Stream<Tuple> getArtistNames(EntityManager em, String matchedValue) {
        String jpql = "SELECT a.artistId as id, a.artistName as name FROM Artist a WHERE a.artistName LIKE :partialName"; //Artist refers Entity and not the table, also artistName is the field in Artist not column name.
        var query = em.createQuery(jpql, Tuple.class);
        query.setParameter("partialName", matchedValue);
        return query.getResultStream();
    }
    public static List<Artist> getArtistsByAlbumName(EntityManager em, String matchedValue) {
        String jpql = "SELECT a FROM Artist a " +
                "JOIN albums album " + // albums field mentioned here is the one defined in Artist.java and not the Album Entity.
                "WHERE album.albumName LIKE ?1";
        var query = em.createQuery(jpql, Artist.class);
        query.setParameter(1, matchedValue);
        return query.getResultList();
    }
}
