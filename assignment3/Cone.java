import java.util.ArrayList;

/**
 * class that uses the FileReader to read cone.txt file and store it in asciiArt
 *  @author joseph groome
 */
public class Cone extends IceCream {
    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    private static final String ANSI_RESET = "\u001B[0m";


    /**
     * Uses the FileReader to read cone.txt file and store it in asciiArt
     * @return Cone with ASCII art
     */
    public Cone() {
        ArrayList<String> lines = FileReader.getLines("cone.txt");
        if (lines != null && !lines.isEmpty()) {
            this.asciiArt = new ArrayList<>();
            for (String line : lines) {
                this.asciiArt.add(ANSI_BROWN + line + ANSI_RESET);
            }
        }
    }
}