package strategy;

/**
 * weapon that representing a thrown knife.
 * The knife goes across the screen in an animation.
 * @author joseph groome
 */
public class WeaponKnife extends WeaponBehavior {

    /**
     * Creates a knife weapon with a default speed.
     */
    public WeaponKnife() { super(200); }

    /**
     * Creates a knife with the given speed.
     *
     * @param speed the delay between animation frames
     */
    public WeaponKnife(int speed) { super(speed); }

    @Override
    public void attack() {
        attackWithCharacter("Rogue");
    }

    @Override
    public void attackWithCharacter(String characterArt) {
        final String projectile = "-]---->";
        final int frames = 16;
        final int rowOffset = 2;

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
