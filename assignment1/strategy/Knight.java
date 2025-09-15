package strategy;

/**
 * character type: Knight.
 * Displays ASCII art when represented as a string.
 * @author joseph groome
 */
public class Knight extends Character {
    public Knight(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Knight " + name + "\n" +
               " __\n" +
               "(--)";
    }
}

