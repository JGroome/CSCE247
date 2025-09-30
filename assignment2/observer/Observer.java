package observer;

/**
 * Observer interface.
 * 
 * Classes that implement this interface can be registered
 * to receive updates whenever a notice is issued.
 * @author Joseph Groome
 */
public interface Observer {

    /**
     * Called when a notice is issued.
     *
     * @param warning true if the notice is a warning, false otherwise
     * @param note    the integer code of the notice
     */
    void update(boolean warning, int note);
}
