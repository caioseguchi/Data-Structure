package DSingleLinkedList;

import java.sql.Date;

public class Album {
    //Variables
    private int albumId;
    private int artistId;
    private String name;
    private Date releaseDate;

    //Constructor
    public Album(int albumId, int artistId, String name, Date releaseDate) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    //Getter and Setters
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    //toString

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", artistId=" + artistId +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}//class
