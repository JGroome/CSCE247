package state;

/**
 * Represents the In Transit state of a package.
 * A package here is being shipped. Base ETA is 5 days,
 * with  a chance of delay 1–7 extra days.
 * @author joseph groome
 */
public class InTransitState extends State {
    private final int totalDays;
    private final boolean delayed;

    /**
     * Creates an InTransitState for the given package.
     * @param pkg The package this state belongs to.
     */
    public InTransitState(Package pkg) {
        super(pkg);
        int base = 5;
        boolean hasDelay = random.nextDouble() < 0.30; 
        int extra = hasDelay ? (1 + random.nextInt(7)) : 0; 
        this.totalDays = base + extra;
        this.delayed = hasDelay;
    }

    /**
     * @return Status string: "The X is/are out for delivery."
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getDisplayName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
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
            .append(" experienced a delay in shipping.\n");
        }
        sb.append("The ").append(pkg.getDisplayName())
        .append(" should arrive within ")
        .append(totalDays).append(" business ")
        .append(pkg.getVerb("day", "days"))
        .append(".");
        return sb.toString();
    }
}