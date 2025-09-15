package strategy;

/**
 * weapon for characters without a weapon.
 * The attack does nothing.
 * @author joseph groome
 */
public class WeaponNone extends WeaponBehavior {

    /**
     * Creates a weaponless behavior.
     */
    public WeaponNone() { super(0); }

    /**
     * Creates a weaponless behavior (speed is ignored).
     *
     * @param speed unused
     */
    public WeaponNone(int speed) { super(0); }

    @Override
    public void attack() {
        System.out.println("…has no weapon and does nothing.");
    }

    @Override
    public void attackWithCharacter(String characterArt) {
        Resources.clear();
        System.out.println(characterArt);
        System.out.println("…has no weapon and does nothing.");
    }
}
