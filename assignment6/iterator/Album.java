package iterator;

import java.util.Iterator;

/**
 * Represents a music album with a collection of songs.
 * Provides methods to add songs and create iterators
 * for traversing the songs in order or in shuffle mode.
 * @author joseph groome
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

    /**
     * Constructs an Album with the given name.
     *
     * @param name the name of the album
     */
    public Album(String name) {
        this.name = name;
        this.songs = new Song[100];
        this.count = 0;
    }

    /**
     * Adds a song to the album.
     *
     * @param name   the title of the song
     * @param artist the artist performing the song
     * @param length the length of the song in minutes
     * @param genre  the musical genre of the song
     * @return true if the song was added, false if the album is full
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (count >= songs.length) {
            return false;
        }
        songs[count++] = new Song(name, artist, length, genre);
        return true;
    }

    /**
     * Creates an iterator to traverse the songs in order.
     *
     * @return an iterator over the songs in order
     */
    public Iterator<Song> createInOrderIterator() {
        return new InOrderIterator(songs, count);
    }

    /**
     * Creates an iterator to traverse the songs in random order.
     *
     * @return an iterator over the songs in shuffled order
     */
    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(songs, count);
    }

    /**
     * Gets the name of the album.
     *
     * @return the album name
     */
    public String getName() {
        return name;
    }
}
