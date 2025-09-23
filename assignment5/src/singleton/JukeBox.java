package singleton;

import java.util.ArrayList;

/**
 * Class that manages songs.
 * Provides methods to access all songs and request playback.
 * @author Joseph Groome
 */
public class JukeBox {
    private static JukeBox jukeBox;

    private ArrayList<Song> songs;

    private JukeBox() {
        songs = DataLoader.getSongs();
    }

    /**
     * Gets the single instance of JukeBox.
     *
     * @return the instance
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Returns all songs in the JukeBox.
     *
     * @return an ArrayList of Songs
     */
    public ArrayList<Song> getAllSongs() {
        return songs;
    }

    /**
     * Requests to play a song by the number in the list.
     *
     * @param num the number of the song
     */
    public void requestSong(int num) {
        if (num < 0 || num >= songs.size()) {
            System.out.println("Invalid song number.");
            return;
        }
        Song s = songs.get(num);
        System.out.println("Now Playing: " + s);
        s.play();
    }
}
