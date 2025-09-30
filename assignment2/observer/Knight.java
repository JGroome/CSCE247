package observer;

/**
 * Knight observer in the town.
 * 
 * Reacts to notices by preparing for battle or greeting visitors and plays a trumpet sound.
 * @author Joseph Groome
 */
public class Knight implements Observer {

    /**
     * Creates a Knight and registers it with the watchman or greeter.
     *
     * @param watchman the town's watchman
     * @param greeter  the town's greeter
     */
    public Knight(Subject watchman, Subject greeter) {
        watchman.registerObserver(this);
        greeter.registerObserver(this);
    }

    /**
     * Reacts to notices for the one its registered from.
     *
     * @param warning true if the notice is a warning, false otherwise
     * @param note    the integer code of the notice
     */
    @Override
    public void update(boolean warning, int note) {
        if (warning) {
            System.out.println("Knight draws sword and prepares for battle!");
        } else {
            System.out.println("Knight stands at attention to greet visitors.");
        }
        Trumpet.play(warning, note);
    }
}
