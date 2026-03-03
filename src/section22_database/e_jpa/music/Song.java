package section22_database.e_jpa.music;

import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;

    @Column(name = "track_number")
    private int trackNumber;

    @Column(name = "song_title")
    private String songTitle;

    public Song() {
    }

    public Song(int songId, int trackNumber, String songTitle) {
        this.songId = songId;
        this.trackNumber = trackNumber;
        this.songTitle = songTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", trackNumber=" + trackNumber +
                ", songTitle='" + songTitle + '\'' +
                '}';
    }
}
