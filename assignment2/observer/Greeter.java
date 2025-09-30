package observer;

/**
 * Greeter subject in the town.
 * 
 * The Greeter issues notices when messengers or royalty arrive.
 * @author Joseph Groome
 */
public class Greeter extends Subject {

    /**
     * Issues a notice from the Greeter and notifies observers.
     *
     * @param note the type of notice
     */
    @Override
    public void issueNotice(int note) {
        System.out.println("Greeter issues a notice: " + note);
        notifyObservers(note);
    }
}
