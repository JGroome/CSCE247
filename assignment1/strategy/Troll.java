package strategy;

/**
 * character type: Troll.
 * Displays ASCII art when represented as a string.
 * @author joseph groome
 */
public class Troll extends Character {
    public Troll(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Troll " + name + "\n" +
               "/^\\";
    }
}
