package main;

import java.util.Scanner;

import book.BooksManager;
import lending.LendingManager;
import reader.ReaderManager;

public class Menu {

	static Scanner scan = new Scanner(System.in);
	static String luaChon;
	static boolean test = false;

	public static void menuManager() {
		hienThi();
		do {
			luaChon = scan.nextLine();
			switch (luaChon) {
			case "1":
				BooksManager.menuBook();
				break;
			case "1.1":
				BooksManager.inputAdd2End();
				hienThi();
				break;
			case "1.2":
				BooksManager.displayData();
				hienThi();
				break;
			case "1.3":
				BooksManager.timBcode();
				hienThi();
				break;
			case "1.4":
				BooksManager.inputAdd2Begin();
				hienThi();
				break;
			case "1.5":
				BooksManager.inputAdd2Begin();
				hienThi();
				break;
			case "1.6":
				BooksManager.delete();
				hienThi();
				break;

			case "2":
				ReaderManager.menuReader();
				break;
			case "2.1":
				ReaderManager.input();
				hienThi();
				break;
			case "2.2":
				ReaderManager.displayData();
				hienThi();
				break;
			case "2.3":
				ReaderManager.timRcode();
				hienThi();
				break;
			case "2.4":
				ReaderManager.delete();
				hienThi();
				break;

			case "3":
				LendingManager.menuLending();
				break;
			case "3.1":
				LendingManager.inputAdd2End();
				hienThi();
				break;
			case "3.2":
				LendingManager.displayData();
				hienThi();
				break;
				
			case "4":
				test = true;
				System.out.println("************ END *************");
				break;
				
			default:
				System.out.println("The option is not valid. Please enter again another one: ");
				break;
			}
		} while (test==false);
		//scan.close();

	}
	
	public static void hienThi() {
		System.out.println("");
		System.out.println("He thong quan ly thu vien: ");

		BooksManager.menuBook();
		ReaderManager.menuReader();
		LendingManager.menuLending();

		System.out.println("4.  Exit");
		System.out.println("Enter your option: ");
	}

}
