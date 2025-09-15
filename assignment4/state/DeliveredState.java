package state;

/**
 * Represents the Delivered state of a package.
 * The package has arrived.
 * @author joseph groome
 */
public class DeliveredState extends State {
    
    /**
     * Creates a DeliveredState for the given package.
     * @param pkg The package this state belongs to.
     */
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    /**
     * @return Status string: "The X has/have arrived."
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("has", "have") + " arrived.";
    }

    /**
     * @return ETA string: "The X is/are here."
     */
    @Override
    public String getETA() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("is", "are") + " here.";
    }
}
