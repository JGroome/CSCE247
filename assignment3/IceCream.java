import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
/**
 * A abstract base class for IceCream components (cones, scoops, toppings).
 * @author joseph groome
 */
public abstract class IceCream {
    protected ArrayList<String> asciiArt = new ArrayList<>();
    protected int numScoops = 0;

     /**
     * adds a scoop layer multiple times on top of the current art.
     * @param layer ASCII lines for the scoop
     * @param times how many scoops to add
     */
    protected void addLayer(List<String> layer, int times) {
        if (layer == null || layer.isEmpty() || times <= 0) return;
        ArrayList<String> newArt = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            newArt.addAll(layer);
        }
        newArt.addAll(this.asciiArt);
        this.asciiArt = newArt;
    }

    /**
     * Returns a string with ASCII art or scoop count.
     *
     * @return ice cream drawing or description
     */
    @Override
    public String toString() {
        if (!asciiArt.isEmpty()) {
            StringJoiner sj = new StringJoiner(System.lineSeparator());
            for (String line : asciiArt) sj.add(line);
            return sj.toString();
        }
        return "IceCream with " + numScoops + " scoop(s).";
    }
}