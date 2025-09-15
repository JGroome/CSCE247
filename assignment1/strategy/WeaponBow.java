package strategy;

/**
 * weapon that representing a bow and arrow.
 * The arrow goes across the screen in an animation.
 * @author joseph groome
 */
public class WeaponBow extends WeaponBehavior {

    /**
     * Creates a bow weapon with a default speed.
     */
    public WeaponBow() { super(300); }

    /**
     * Creates a bow weapon with the given speed.
     *
     * @param speed the delay between animation frames
     */
    public WeaponBow(int speed) { super(speed); }

    @Override
    public void attack() {
        attackWithCharacter("Archer");
    }

    @Override
    public void attackWithCharacter(String characterArt) {
        final String projectile = "}------>";
        final int frames = 18;
        final int rowOffset = 1;

        for (int i = 0; i < frames; i++) {
            Resources.clear();
            System.out.println(characterArt);
            for (int r = 0; r < rowOffset; r++) System.out.println();
            System.out.println((new String(new char[i]).replace('\0', ' ')) + projectile);
            Resources.sleep(speed);
        }
        System.out.println();
    }
}
