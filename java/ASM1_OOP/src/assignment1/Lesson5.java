package assignment1;

import java.util.Scanner;

public class Lesson5 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi ky tu: ");
		String str = scan.nextLine();
		char[] array = str.toCharArray();
		int length = str.length();
		
	    String sub1 = str.substring(0,length);
	  	StringBuilder sub2 = new StringBuilder(sub1);
	  	
	   	if (sub1.equals(sub2.reverse().toString())){
	   	System.out.println("Chuoi vua nhap khong phai la mot chuoi doi xung");
	    }else{
	   	System.out.println("Chuoi vua nhap la mot chuoi doi xung.");
		}
	}
}
