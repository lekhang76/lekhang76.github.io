package ui;

import java.util.Scanner;

import business.Floyd;

/**
 * Menu
 *
 */
public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("Chon diem nha ga bat dau va nha ga dich");
		System.out.println("1.Kim Ma  2.Pho Co  3.Lang  4.Le Duan");
		System.out.println("Ga xuat phat:");
		int dau = scan.nextInt();
		System.out.println("Ga dich");
		int cuoi = scan.nextInt();
		Floyd.Floyds(--dau, --cuoi);

	}

}
