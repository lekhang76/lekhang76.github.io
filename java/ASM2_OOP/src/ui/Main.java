package ui;

import java.util.Scanner;

import business.BeeHive;

/**
 * Menu and Main
 *
 */
public class Main {

	static Scanner scan = new Scanner(System.in);

	// menu
	static void menu() {

		int n;

		do {
			System.out.println("-----------Bee hive-----------");
			System.out.println("      1 - Create bee list");
			System.out.println("      2 - Attack bees");
			System.out.println("      3 - End");
			System.out.println("Enter your choice (1, 2 or 3): ");

			n = scan.nextInt();

			switch (n) {

			case 1:
				BeeHive.genBees(); // goi phuong thuc khoi tao 10 con ong
				System.out.println("Bees details at the beginning:");
				BeeHive.displayBees();
				break;
			case 2:
				BeeHive.damage(); // goi phuong thuc damage bay ong
				System.out.println("Bees details at the moment:");
				BeeHive.displayBees();
				break;
			default:
				break;
			}

			BeeHive.check(); // kiem tra bay ong chet het chua

		} while ((0 < n) && (n < 3));
		System.out.println("Game Over");
	}

	//main
	public static void main(String[] args) {

		menu();

	}

}
