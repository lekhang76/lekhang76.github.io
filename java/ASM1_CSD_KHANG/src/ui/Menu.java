package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.Function;
import business.Manager;
import entity.MyFile;

public class Menu {
	public static ArrayList<MyFile> listFile = new ArrayList<MyFile>();
	static Scanner scan = new Scanner(System.in);
	static int luaChon, n;

	public static void menu() {
		boolean test = false;
		do {
			System.out.println("------------- Quan ly cac file trong thu muc -------------");
			System.out.println("|     1. Nhap duong dan cua thu muc.                     |");
			System.out.println("|     2. Hien thi cac tap tin cua thu muc.               |");
			System.out.println("|     3. Sap xep cac file .txt theo kich thuoc tang dan  |");
			System.out.println("|     4. Tim file .txt chua ky tu nhap vao               |");
			System.out.println("|     5. Exit                                            |");
			System.out.println("----------------------------------------------------------");
			System.out.print("Enter your choice: ");
			do {
				try {
					luaChon = Integer.parseInt(scan.nextLine());
					test = true;
				} catch (Exception e) {
					System.out.print("Da xay ra loi, vui long nhap lai: ");
				}
			} while (!test);

			switch (luaChon) {
			case 1:
				Manager.addFileTxt(Manager.CurFolder());
				break;
			case 2:
				Manager.displayFolder();
				break;
			case 3:
				System.out.println("     1- Sap xep bang SelectionSort");
				System.out.println("     2- Sap xep bang InsertionSort");
				System.out.print("Enter your choice: ");
				do {
					test = false;
					try {
						System.out.println("Chon : 1- Selection sort  2- Insertion sort");
						n = Integer.parseInt(scan.nextLine());
						test = true;
					} catch (NumberFormatException e) {
						System.out.print("Da xay ra loi, vui long nhap lai: ");
					}
				} while (n < 0 || n > 3 || !test);
				System.out.format("| %-14s ", "Name");
				System.out.format("| %-5s|\n", "Size");

				switch (n) {
				case 1:
					Function.selection_Sort(Menu.listFile);
					for (MyFile a : Menu.listFile) {
						System.out.format("| %-15s", a.getName());
						System.out.format("| %-5s|\n", a.getSize());
					}
					break;
				case 2:
					Function.insertion_Sort(Menu.listFile);
					for (MyFile b : Menu.listFile) {
						System.out.format("| %-15s", b.getName());
						System.out.format("| %-5s|\n", b.getSize());
					}
					break;
				}
				break;
			case 4:
				System.out.print("Nhap chuoi muon tim kiem: ");
				Manager.Search();
				break;
			}
		} while (0 < luaChon && luaChon < 5);
		System.out.println("********* CHUONG TRINH KET THUC! **********");
	}

}
