package assignment1;

import java.util.Scanner;

public class Lesson1 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao 3 so thuc: ");

		System.out.print("a = ");
		double a = scan.nextDouble();

		System.out.print("b = ");
		double b = scan.nextDouble();

		System.out.print("c = ");
		double c = scan.nextDouble();

		double max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("So co gia tri lon nhat la: " + max);
		
		double min = a;

		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		System.out.println("So co gia tri lon nhat la: " + min);
	}
}