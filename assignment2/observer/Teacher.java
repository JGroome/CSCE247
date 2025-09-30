package observer;

/**
 * Teacher observer in the town.
 * 
 * Reacts to notices by adjusting classroom activities and plays a trumpet sound.
 * @author Joseph Groome
 */
public class Teacher implements Observer {

    /**
     * Creates a Teacher and registers it with the watchman or greeter.
     *
     * @param watchman the town's watchman
     * @param greeter  the town's greeter
     */
    public Teacher(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Reacts to notices from either othe that its registered with.
     *
     * @param warning true if the notice is a warning, false otherwise
     * @param note    the integer code of the notice
     */
    @Override
    public void update(boolean warning, int note) {
        if (warning) {
            System.out.println("Teacher sends students home for safety!");
        } else {
            System.out.println("Teacher tells students to line up for the parade.");
        }
        Trumpet.play(warning, note);
    }
}
