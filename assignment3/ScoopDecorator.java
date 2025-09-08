import java.util.ArrayList;
import java.util.List;

/**
 * abstract decorator class for adding scoops of a specific flavor to an IceCream.
 * subclasses provide the ASCII art for their flavor and call addFlavorLayers.
 * @author joseph groome
 */

public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numFlavorScoops;

     /**
     * Creates a decorator for adding scoops to an ice cream.
     *
     * @param iceCream the base ice cream
     * @param numScoops number of scoops to add
     */

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        if (iceCream == null) throw new IllegalArgumentException("iceCream cannot be null");
        if (numScoops < 0) throw new IllegalArgumentException("numScoops cannot be negative");

        this.iceCream = iceCream;
        this.numFlavorScoops = numScoops;


        this.asciiArt = new ArrayList<>(iceCream.asciiArt);
        this.numScoops = iceCream.numScoops + numScoops;

    }
    /**
     * Adds layers of flavor scoops to the ice cream's ASCII art.
     * @param fileName the name of the file containing custom ASCII art 
     * @param defaultLayer the default ASCII art layer to use if file is not provided
     * @param times number of times to add the layer
     */
    protected void addFlavorLayers(String fileName, List<String> defaultLayer, int times) {
        ArrayList<String> layer = FileReader.getLines(fileName);
        List<String> chosen = (layer != null && !layer.isEmpty()) ? layer : defaultLayer;
        addLayer(chosen, times);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
