package strategy;

/**
 * weapon behavior representing throwing stars.
 * The stars spin in place to simulate a throwing animation.
 * @author joseph groome
 */
public class WeaponStars extends WeaponBehavior {

    /**
     * Creates throwing stars with a default speed.
     */
    public WeaponStars() { super(250); }

    /**
     * Creates throwing stars with the given speed.
     *
     * @param speed the delay between animation frames
     */
    public WeaponStars(int speed) { super(speed); }

    @Override
    public void attack() {
        attackWithCharacter("Ninja");
    }

    @Override
    public void attackWithCharacter(String characterArt) {
        final String[] frames = {
            "   *\n  /|\\\n --*--\n  \\|/\n   *",
            "  \\|/\n --*--\n  /|\\",
            "   *\n  \\|/\n --*--\n  /|\\\n   *"
        };

        for (int i = 0; i < 8; i++) {
            Resources.clear();
            System.out.println(characterArt + "\n");
            System.out.println(frames[i % frames.length] + "  (shuriken spins!)");
            Resources.sleep(speed);
        }
        System.out.println();
    }
}
