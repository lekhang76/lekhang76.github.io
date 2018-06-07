package entity;

import java.util.Random;

/**
 * Khoi tao doi tuong Ong
 *
 */
public abstract class Bee {

	private int id;
	private int heal;
	private boolean isDie;
	private int dieArt;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

	public boolean isDie() {
		return isDie;
	}

	public void setDie(boolean isDie) {
		this.isDie = isDie;
	}

	public int getDieArt() {
		return dieArt;
	}

	public void setDieArt(int dieArt) {
		this.dieArt = dieArt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bee() {
		setHeal(100);
		setDie(false);
	}

	public Bee(int id) {
		setId(id);
		setHeal(100);
		setDie(false);
	}

	// phuong thuc damage ong
	public void damage() {
		int n = new Random().nextInt(100);
		if (!isDie()) {
			setHeal((getHeal() - n) < 0 ? 0 : (getHeal() - n));// setHeal = 0 neu Heal la so am;
			if (getHeal() < dieArt) {
				setDie(true);
			}
		}
	}

	//Hien thi con ong
	public abstract void display();

}
