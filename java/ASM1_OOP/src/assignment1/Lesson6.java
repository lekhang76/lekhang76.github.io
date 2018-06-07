package assignment1;

import java.util.Scanner;

public class Lesson6 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap vao mot chuoi ky tu: ");
		String my_string = scan.nextLine();
		System.out.println("Do dai cua chuoi la: " + my_string.length() + " ky tu");
	}
}