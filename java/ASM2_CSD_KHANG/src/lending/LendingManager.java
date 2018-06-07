package lending;

import java.util.Scanner;

import book.BooksManager;
import reader.ReaderManager;

public class LendingManager {
	public static Queue lList = new Queue();
	static Scanner scan = new Scanner(System.in);

	// 1.1 nhap va them vao dau
	public static void inputAdd2End() {
		Lending lending = new Lending();

		System.out.println();
		System.out.println("ADD A NEW LENDING INTO THE FIRST OF THE LIST:");

		System.out.println("BCode: ");
		String bcode=scan.nextLine();
		while ((BooksManager.blist.searchBcode(bcode) == null)) {
			System.out.println("Bcode khong hop le, vui long nhap Bcode san co");
			bcode = scan.nextLine();
		}
		System.out.println("Done.");
		lending.setBcode(bcode);

		System.out.println("RCode: ");
		String rcode=scan.nextLine();
		while ((ReaderManager.rList.searchByRcode(rcode) == null)) {
			System.out.println("Rcode khong hop le, vui long nhap Rcode san co");
			rcode = scan.nextLine();
		}
		System.out.println("Done.");
		lending.setRcode(rcode);
		
		System.out.println("State: ");
		System.out.println("0: Sach khong duoc gui toi nguoi doc.\r\n" + 
				"1: Nguoi doc chua tra.\r\n" + 
				"2: Sach da duoc tra.");
		int n = scan.nextInt(); // state mang 3 giá trị 0,1,2

		while (n != 0 && n != 1 && n != 2) {
			System.out.print("So ban vua nhap khong hop le, vui long nhap vao so khac: ");
			n = Integer.parseInt(scan.nextLine());
		}
		lending.setState(n);
		
		lList.enQueue(lending);
		System.out.println("Add done.");
		
	}

	// 1.2 Display data
	public static void displayData() {
		// value = price*quantity;
		System.out.printf("| %-10s", "BCode");
		System.out.printf("| %-20s", "Rcode");
		System.out.printf("| %-10s", "State");
		System.out.println();

		for (int i = lList.size(); i > 0; i--) {
			lList.get(i).hienThiLending();
		}
	}
	
	// menu lending
	public static void menuLending() {
		System.out.println("");
		System.out.println("3. Lending list:");
		System.out.println("    3.1. Input data");
		System.out.println("    3.2. Display data");
		System.out.println("");

	}

}
