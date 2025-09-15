package strategy;

/**
 * character type: King.
 * Displays ASCII art when represented as a string.
 * @author joseph groome
 */
public class King extends Character {
    public King(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "King " + name + "\n" +
               "__/^^^\\__";
    }
}