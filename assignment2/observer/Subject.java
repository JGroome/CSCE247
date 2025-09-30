package observer;

import java.util.ArrayList;

/**
 * Subject class for the Observer design pattern.
 * 
 * A Subject maintains a list of objects that can be
 * registered or removed. When a notice is issued, the Subject notifies
 * all observers.
 * @author Joseph Groome
 */
public abstract class Subject {
    /** The list of observers watching this subject. */
    protected ArrayList<Observer> observers;

    /**
     * Constructs a new Subject with no observers.
     */
    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * Registers an observer with this subject.
     *
     * @param observer the observer to add
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from this subject.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Issues a notice from this subject.
     *
     * @param note the integer code for the notice
     */
    public abstract void issueNotice(int note);

    /**
     * Notifies all registered observers of a notice.
     *
     * @param note the integer code for the notice
     */
    public void notifyObservers(int note) {
        boolean warning = note > 1;
        for (Observer obs : observers) {
            obs.update(warning, note);
        }
    }
}
