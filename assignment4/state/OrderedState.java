package state;

/**
 * Represents the Ordered state of a package.
 * A package starts here before being mailed.
 * Base ETA is 2 days with a chance of 
 * being delayed 1-3 days
 * @author joseph groome
 */

public class OrderedState extends State {
    private final int totalDays;
    private final boolean delayed;

    /**
     * Creates an OrderedState for the given package.
     * @param pkg The package this state belongs to.
     */
    public OrderedState(Package pkg) {
        super(pkg);
        int base = 2;
        boolean hasDelay = random.nextDouble() < 0.20; 
        int extra = hasDelay ? (1 + random.nextInt(3)) : 0; 
        this.totalDays = base + extra;
        this.delayed = hasDelay;
    }

     /**
     * @return Status string: "The X was/were ordered."
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("was", "were") + " ordered.";
    }

    /**
     * @return ETA string, including possible delay message.
     */
    @Override
    public String getETA() {
        StringBuilder sb = new StringBuilder();
        if (delayed) {
            sb.append("The ").append(pkg.getDisplayName()).append(" ")
            .append(pkg.getVerb("has", "have"))
            .append(" experienced a slight delay in manufacturing.\n");
        }
        sb.append("The ").append(pkg.getDisplayName())
        .append(" will be shipped within ")
        .append(totalDays).append(" business ")
        .append(pkg.getVerb("day", "days"));
        return sb.toString();
    }
}