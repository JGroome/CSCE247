package observer;

/**
 * Watchman subject in the town.
 * 
 * The Watchman issues notices when enemies approach or the city is breached.
 * @author Joseph Groome
 */
public class Watchman extends Subject {

    /**
     * Issues a notice from the Watchman and notifies observers.
     *
     * @param note the type of notice
     */
    @Override
    public void issueNotice(int note) {
        System.out.println("Watchman issues a notice: " + note);
        notifyObservers(note);
    }
}
