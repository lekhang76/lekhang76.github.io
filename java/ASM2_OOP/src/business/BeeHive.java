package business;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entity.Bee;
import entity.Drone;
import entity.QueenBee;
import entity.WorkerBee;


/**
 *  Tao bay Ong gom 10 con Ong, damage bay Ong, hien thi bay Ong, kiem tra so luong Ong da chet
 *
 */
public class BeeHive {
	
	final static int N = 10;
	static ArrayList<Bee> bees = new ArrayList<Bee>();
	static Scanner scan = new Scanner(System.in);

	// khoi tao bay ong 10 con, dung dau la 1 con Ong Chua
	public static void genBees() {

		bees.add(new QueenBee(1));

		for (int i = 1; i < N; i++) {
			int x = new Random().nextInt(2);
			// int x = (int) (Math.random() * 3);
			switch (x) {
			case 0:
				bees.add(new Drone(i + 1));
				break;
			case 1:
				bees.add(new WorkerBee(i + 1));
				break;
			// case 2:
			// bees.add(new Queen(i + 1));
			// break;
			}
		}
	}

	// goi phuong thuc damage bay ong
	public static void damage() {
		for (Bee x : bees) {
			x.damage();
		}
	}

	// hien thi bay ong
	public static void displayBees() {
		for (Bee x : bees) {
			x.display();
		}
	}
	
	//kiem tra tat ca Ong da chet chua
	public static void check() {
		// tinh so con ong da chet trong ArrayList
		int count = 0;
		for (Bee x : bees) {
			if (x.isDie() == true) {
				count++;
			}
		}
		// hien thi thong bao neu 10 con Ong deu chet
		if (count == 10) {
			System.out.println("All bees are dead!");
		}
	}
}
