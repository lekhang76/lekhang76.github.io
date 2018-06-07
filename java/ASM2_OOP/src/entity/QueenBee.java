package entity;

/**
 * Khoi tao doi tuong Ong chua
 *
 */
public class QueenBee extends Bee {

	final int dieArt = 20;

	public QueenBee(int i) {
		super(i);
		super.setDieArt(dieArt);
		super.setType("Queen");
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
