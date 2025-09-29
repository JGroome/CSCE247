package iterator;

import java.util.Iterator;
import java.util.Random;

/**
 * Iterator implementation for songs in a random order.
 * @author joseph groome
 */
public class ShuffleIterator implements Iterator<Song> {
    private Song[] songs;
    private int[] order;
    private int position;
    private int count;
    private Random rand;

    /**
     * Makes a ShuffleIterator.
     * Randomizes the order of the given songs.
     *
     * @param songs array of songs
     * @param count the number of songs in the album
     */
    public ShuffleIterator(Song[] songs, int count) {
        this.songs = songs;
        this.count = count;
        this.rand = new Random();
        this.order = new int[count];
        
        for (int i = 0; i < count; i++) {
            order[i] = i;
        }

        for (int i = count - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = order[i];
            order[i] = order[j];
            order[j] = temp;
        }

        this.position = 0;
    }

    /**
     * Checks if there are more songs to iterate over.
     *
     * @return true if there are more songs, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < count;
    }

    /**
     * Returns the next song in random order.
     *
     * @return the next Song object
     */
    @Override
    public Song next() {
        return songs[order[position++]];
    }
}
