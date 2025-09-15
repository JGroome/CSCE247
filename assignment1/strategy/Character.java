package strategy;

import java.util.Scanner;

/**
 * class for all characters.
 * Characters have a name, an ASCII art, and
 * can be equipped with different weapons.
 * @author joseph groome
 */
public abstract class Character {
    /** The name of the character. */
    protected String name;

    /** The weapon behavior assigned to this character. */
    private WeaponBehavior weaponBehavior;

    /** Scanner for user input. */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Constructs a new character with the given name.
     *
     * @param name the character’s name
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * Sets the character’s weapon.
     *
     * @param weaponBehavior the weapon to assign
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * Prompts the user to press ENTER, clears the screen,
     * and performs the character’s weapon attack.
     */
    public void attack() {
        System.out.println("\nPress ENTER for " + getClass().getSimpleName() + " " + name + " to attack...");
        SCANNER.nextLine();
        Resources.clear();

        if (weaponBehavior == null) {
            System.out.println(toString() + " has no weapon!");
            return;
        }

        weaponBehavior.attackWithCharacter(toString());
    }

    /**
     * Returns a string representation of the character,
     * 
     * @return the character’s ASCII representation
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}
