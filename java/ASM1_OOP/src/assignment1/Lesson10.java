package assignment1;

import java.util.Scanner;

public class Lesson10 {

	public static void menu() {
		
		int luaChon;
		do {
			System.out.println("---------------------------------------------");
			System.out.println("| Nhap so bai ma ban muon thuc hien (tu 1-9):|");
			System.out.println("| Nhap so 10 de thoat:                       |");
			System.out.println("---------------------------------------------");
			Scanner sc = new Scanner(System.in);
			luaChon = sc.nextInt();
			switch (luaChon) {

			case 1:
				System.out.println("Bai 1: Tim GTNN va GTLN cua 3 so nguyen.");
				Lesson1.run();
				break;
			case 2:
				System.out.println("Bai 2: Tim ra loai tam giac.");
				Lesson2.run();
				break;
			case 3:
				System.out.println("Bai 3: Tim GTLN cua day 10 so nguyen.");
				Lesson3.run();
				break;
			case 4:
				System.out.println("Bai 4: In ra day so dao nguoc.");
				Lesson4.run();
				break;
			case 5:
				System.out.println("Bai 5: Kiem tra chuoi doi xung.");
				Lesson5.run();
				break;
			case 6:
				System.out.println("Bai 6: In ra do dai cua chuoi.");
				Lesson6.run();
				break;
			case 7:
				System.out.println("Bai 7: Kiem tra 2 mang giong nhau.");
				Lesson7.run();
				break;
			case 8:
				System.out.println("Bai 8: Phep nhan khong gioi han.");
				Lesson8.run();
				break;
			case 9:
				System.out.println("Bai 9: Kiem tra bien so xe.");
				Lesson9.run();
				break;
			}
		}while(luaChon<10); 
			System.out.println("==================Chuong trinh ket thuc================== ");
	}
	
	public static void main(String[] args) {
		menu();
	}
}

