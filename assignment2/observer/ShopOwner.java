package observer;

/**
 * ShopOwner observer in the town.
 * 
 * Reacts to notices by opening or closing the shop and plays a trumpet sound.
 * @author Joseph Groome
 */
public class ShopOwner implements Observer {

    /**
     * Creates a Shop Owner and registers it with the watchman or greeter.
     *
     * @param watchman the town's watchman
     * @param greeter  the town's greeter
     */
    public ShopOwner(Subject watchman, Subject greeter) {
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
            System.out.println("ShopOwner closes shop quickly!");
        } else {
            System.out.println("ShopOwner prepares goods for visitors.");
        }
        Trumpet.play(warning, note);
    }
}

