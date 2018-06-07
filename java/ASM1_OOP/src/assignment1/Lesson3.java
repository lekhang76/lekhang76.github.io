package assignment1;

import java.util.Scanner;

public class Lesson3 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao 10 so nguyen: ");
		
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = scan.nextInt();
		}
		
		int max = array[0];
		for (int i = 1; i < 10; i++ ) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Gia tri lon nhat cua mang la: " + max);
	}
}
