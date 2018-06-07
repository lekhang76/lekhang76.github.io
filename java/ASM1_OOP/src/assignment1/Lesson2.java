package assignment1;

import java.util.Scanner;

public class Lesson2 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao do dai 3 canh cua tam giac: ");

		System.out.print("a = ");
		double a = scan.nextDouble();

		System.out.print("b = ");
		double b = scan.nextDouble();

		System.out.print("c = ");
		double c = scan.nextDouble();
		
		if ((a+b<=c)||(b+c<=a)||(a+c<=b)){
			System.out.println("Day khong phai la 3 canh cua tam giac");
		}
		else {
			if ((a==b) && (a==c)) {
				System.out.println("Day la 3 canh cua tam giac deu");
			}
			else {
				if ((a==b) || (a==c) || (b==c)) {
					System.out.println("Day la 3 canh cua tam giac can");
				}
				else {
					System.out.println("Day la 3 canh cua tam giac thuong");
				}
			}
		}
	}
}
