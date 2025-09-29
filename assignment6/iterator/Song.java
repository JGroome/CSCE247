package iterator;

/**
 * Represents a single song in an album.
 * Each song has a name, artist, length, and genre.
 * @author joseph groome
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Makes a Song object.
     *
     * @param name   the title of the song
     * @param artist the artist performing the song
     * @param length the length of the song in minutes
     * @param genre  the musical genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Returns a string of the song.
     *
     * @return formatted string containing name, artist, length, and genre
     */
    @Override
    public String toString() {
        return name + " by " + artist + " (" + length + " mins, " + genre + ")";
    }
}
