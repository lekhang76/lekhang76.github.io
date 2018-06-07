package assignment1;

import java.util.Scanner;

public class Lesson7 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap mang so thu nhat: ");
		double[] a = new double[5];
		int i = 0;
		for (i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println("Nhap mang so thu hai: ");
		double[] b = new double[5];
		for (i = 0; i < 5; i++) {
			b[i] = scan.nextInt();
		}

		int dem = 0;
		for (i = 0; i < 5; i++) {
			if (a[i] == b[i]) {
				dem++;
			}
		}
		if (dem == 5) {
			System.out.println("Hai mang so vua nhap hoan toan giong nhau.");
		} else {
			System.out.println("Hai mang so vua nhap khac nhau.");
		}
		for (i = 0; i < 5; i++) {
			if (a[i] != b[i]) {
				System.out.println("Khac nhau o phan tu: A[" + i + "]=" + a[i] + " va B[" + i + "]=" + b[i]);
			} else {
				++dem;
			}
		}
	}
}