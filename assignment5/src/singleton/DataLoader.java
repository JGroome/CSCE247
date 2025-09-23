package singleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class for loading song data
 * from a text file into a Song object.
 * @author Joseph Groome
 */
public class DataLoader {

    private static final String DEFAULT_LIST_PATH = "songs" + File.separator + "songs.txt";

    private static final String DEFAULT_SONGS_DIR  = "songs";

    /**
     * Loads songs using the default list file.
     *
     * @return an ArrayList of Song objects
     */
    public static ArrayList<Song> getSongs() {
        return getSongs(DEFAULT_LIST_PATH, DEFAULT_SONGS_DIR);
    }

    /**
     * Loads songs from the given list file and song directory.
     *
     * @param listPath path to the text file with song info
     * @param songsDir directory containing the audio files
     * @return an ArrayList of Song objects
     */
    public static ArrayList<Song> getSongs(String listPath, String songsDir) {
        ArrayList<Song> out = new ArrayList<>();

        File listFile = new File(listPath);
        if (!listFile.exists()) {
            System.out.println("Song list not found at: " + listFile.getPath());
            return out;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(listFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;

                String[] parts = line.split(",", 3);
                if (parts.length < 3) continue;

                String title   = parts[0].trim();
                String artist  = parts[1].trim();
                String fileName = parts[2].trim();

                String fullPath = songsDir + File.separator + fileName;
                out.add(new Song(title, artist, fullPath));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
