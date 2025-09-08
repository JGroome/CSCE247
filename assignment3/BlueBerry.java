import java.util.Arrays;
import java.util.List;

/**
 * Class that makes Blueberry scoops.
 * @author joseph groome
 */

public class BlueBerry extends ScoopDecorator {
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Constructor for Blueberry scoop decorator.
     * @param iceCream the existing ice cream to decorate
     * @param numScoops number of blueberry scoops to add
     */
    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);

        List<String> layer = Arrays.asList(
            ANSI_BLUE + "   .-\"\"-. " + ANSI_RESET,
            ANSI_BLUE + "  /  o   \\  " + ANSI_RESET,
            ANSI_BLUE + "  \\  o   / " + ANSI_RESET,
            ANSI_BLUE + "   `-.-`   " + ANSI_RESET
        );

        addLayer(layer, numFlavorScoops);
    }
}
