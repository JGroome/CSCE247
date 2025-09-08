import java.util.Arrays;
import java.util.List;
/**
 * Class that makes Vanilla scoops.
 * @author joseph groome
 */
public class Vanilla extends ScoopDecorator {
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Constructor for Vanilla scoop decorator.
     * @param iceCream the existing ice cream to decorate
     * @param numScoops number of vanilla scoops to add
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);

        List<String> layer = Arrays.asList(
            ANSI_WHITE + "   .-\"\"-. " + ANSI_RESET,
            ANSI_WHITE + "  /  V   \\  " + ANSI_RESET,
            ANSI_WHITE + "  \\      / " + ANSI_RESET,
            ANSI_WHITE + "   `-.-`   " + ANSI_RESET
        );

        // Provided by IceCream (protected)
        addLayer(layer, numFlavorScoops);
    }
}
