package strategy;

/**
 * class for all weapon behaviors.
 * Each weapon has a speed and
 * defines how it performs an attack.
 * @author joseph groome
 */
public abstract class WeaponBehavior {
    /** The delay between attack frames. */
    protected int speed;

    /**
     * Constructs a WeaponBehavior with the given speed.
     *
     * @param speed the delay between animation frames
     */
    public WeaponBehavior(int speed) {
        this.speed = Math.max(0, speed);
    }

    /**
     * Executes the weapon’s attack.
     */
    public abstract void attack();

    /**
     * Executes the weapon’s attack along with a character’s ASCII art.
     *
     * @param characterArt ASCII representation of the character
     */
    public void attackWithCharacter(String characterArt) {
        attack();
    }
}
