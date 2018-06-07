package entity;

/**
 * Khoi tao doi tuong Ong duc
 *
 */
public class Drone extends Bee {

	final int dieArt = 20;

	public Drone(int i) {
		super(i);
		super.setDieArt(dieArt);
		super.setType("Drone");
	}

	@Override
	public void display() {
		System.out.printf("%5d)", getId());
		System.out.printf("%10s", getType());
		System.out.printf("%5d", getHeal());
		if (isDie()) {
			System.out.printf(" %10s%n", "dead");
		} else {
			System.out.printf(" %10s%n", "alive");
		}
	}
}
