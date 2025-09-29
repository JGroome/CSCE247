package iterator;

import java.util.Iterator;

/**
 * Iterator for traversing songs in the album
 * sequentially in the order they were added.
 * @author joseph groome
 */
public class InOrderIterator implements Iterator<Song> {
    private Song[] songs;
    private int position;
    private int count;

    /**
     * Makes an InOrderIterator.
     *
     * @param songs array of songs
     * @param count the number of songs in the album
     */
    public InOrderIterator(Song[] songs, int count) {
        this.songs = songs;
        this.position = 0;
        this.count = count;
    }

    /**
     * Checks if there are more songs to iterate over.
     *
     * @return true if there are more songs, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < count && songs[position] != null;
    }

    /**
     * Returns the next song.
     *
     * @return the next Song object
     */
    @Override
    public Song next() {
        return songs[position++];
    }
}
