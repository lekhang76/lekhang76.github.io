package assignment1;

import java.util.Scanner;

public class Lesson4 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao 10 so nguyen: ");
		
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = scan.nextInt();
		}

		System.out.print("Day so dao nguoc cua day so da nhap la:");
		for (int index = 9; index >= 0; index--) {
			System.out.print("\t");
			System.out.print(array[index]);
		}
	}
}