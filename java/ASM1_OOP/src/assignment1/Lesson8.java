package assignment1;

import java.util.Scanner;

public class Lesson8 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hay nhap mot so nguyen: ");
		double x = scan.nextDouble();
		double tich = 1;
		double Sum = 0;
		while (x != 0) {
			tich = tich * x;
			System.out.println("Tich cua ban la " + tich);
			System.out.print("Hay nhap mot so nguyen tiep theo: ");
			Sum = Sum + x;
			x = scan.nextDouble();
		}
		System.out.println("Tong cac so vua nhap la: " + Sum);
	}
}