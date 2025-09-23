package singleton;

/**
 * Represents a song with a title, artist, and file path to the audio file.
 * Provides accessors for song data and a method to play the song.
 * @author Joseph Groome
 */
public class Song {
    private String title;
    private String artist;
    private String filePath;

    /**
     * Constructs a new Song object.
     *
     * @param title    the song title
     * @param artist   the name of the artist
     * @param filePath the full path to the audio file
     */
    public Song(String title, String artist, String filePath) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
    }

    /**
     * Gets the title of the song.
     *
     * @return the song title
     */
    public String getTitle() { return title; }

    /**
     * Gets the artist of the song.
     *
     * @return the song artist
     */
    public String getArtist() { return artist; }

    /**
     * Gets the file path of the song.
     *
     * @return the file path to the audio file
     */
    public String getFilePath() { return filePath; }

    /**
     * Returns a string of the song
     * in the format "Title — Artist".
     *
     * @return formatted song
     */
    @Override
    public String toString() {
        return String.format("%s — %s", title, artist);
    }

    /**
     * Plays the song using the SongPlayer utility.
     */
    public void play() {
        SongPlayer.play(filePath);
    }
}
