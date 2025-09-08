import java.util.Arrays;
import java.util.List;

/**
 * Class that makes Strawberry scoops.
 * @author joseph groome
 */

public class Strawberry extends ScoopDecorator {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Constructor for Strawberry scoop decorator.
     * @param iceCream the existing ice cream to decorate
     * @param numScoops number of strawberry scoops to add
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);

        List<String> layer = Arrays.asList(
            ANSI_RED + "   .-\"\"-. " + ANSI_RESET,
            ANSI_RED + "  /  *   \\ " + ANSI_RESET,
            ANSI_RED + "  \\  *   / " + ANSI_RESET,
            ANSI_RED + "   `-.-`   " + ANSI_RESET
        );

        addLayer(layer, numFlavorScoops);
    }
}
