package state;
/**
 * Represents a package being shipped, which moves through different
 * states (Ordered, In Transit, Delivered)
 * Changes to singular or plural based on the ammount ordered
 * @author joseph groome
 */

public class Package {
    private final String name;
    private final int quantity;

    private State state;
    private final State orderedState;
    private final State inTransitState;
    private final State deliveredState;

    /**
     * Makes a new package with the given name and ammount.
     *
     * @param name     The name of the item being shipped.
     * @param quantity The quantity of the item (between 1 and 10).
     */

    public Package(String name, int quantity) {
        this.name = (name == null ? "" : name.trim());
        this.quantity = Math.max(1, Math.min(10, quantity));

        this.orderedState   = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);

        this.state = orderedState;
    }

    /**
     * Moves the package to the Ordered state.
     *
     * @return The status and ETA string for this state.
     */
    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Moves the package to the In Transit state.
     *
     * @return The status and ETA string for this state.
     */
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Moves the package to the Delivered state.
     *
     * @return The status and ETA string for this state.
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Internal setter for the current state.
     *
     * @param state The new state of the package.
     */
    void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the name of the package item.
     *
     * @return The item name that was entered.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the display name of the item with correct singular/plural form
     * based on the ammount
     *
     * @return The display name in singular or plural.
     */
    public String getDisplayName() {
        if (quantity == 1) {
            return name;
        } else {
            return name.endsWith("s") ? name : name + "s";
        }
    }

    /**
     * Chooses the correct verb form depending on quantity.
     *
     * @param singular singular.
     * @param plural   plural.
     * @return The right verb for the current quantity.
     */
    public String getVerb(String singular, String plural) {
        return (quantity == 1) ? singular : plural;
    }
}
