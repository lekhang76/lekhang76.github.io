package reader;

import java.util.Scanner;

public class ReaderManager {
	public static Stack rList = new Stack();
	static Scanner scan = new Scanner(System.in);

	// 2.1 Push Reader vao Stack
	public static void input() {
		Reader reader = new Reader();
		scan = new Scanner(System.in);

		System.out.println();
		System.out.println("Them Reader vao danh sach:");

		System.out.println("RCode: ");
		String rcode = scan.nextLine();
		while (rList.searchByRcode(rcode) != null) {
			System.out.println("Rcode da ton tai, vui long nhap lai");
			rcode = scan.nextLine();
		}
		while ("".equals(rcode)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			rcode = scan.nextLine();
		}
		System.out.println("Done.");
		reader.setRcode(rcode);

		System.out.println("Name: ");
		String name = scan.nextLine();
		reader.setName(name);

		System.out.println("Byear (1900-2010): ");
		int byear = Integer.parseInt(scan.nextLine());
		while ((byear < 1900) || (byear > 2010)) {
			System.out.println("Da xay ra loi, vui long nhap lai:");
			byear = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Done.");
		reader.setByear(byear);

		rList.push(reader);
		System.out.println("Add done.");

	}

	// 2.2 hien thi reader
	public static void displayData() {

		System.out.printf("| %-10s", "RCode");
		System.out.printf("| %-20s", "Name");
		System.out.printf("| %-10s%n", "Byear");

		for (int i = rList.size(); i > 0; i--) {
			rList.get(i).hienThiReader();
		}
	}

	// 2.3 Search by bcode
	public static void timRcode() {
		System.out.print("Moi nhap vao Rcode can tim: ");
		String rcode = scan.nextLine();

		ReaderNode rNode = rList.searchByRcode(rcode);
		if (rNode != null) {
			System.out.printf("| %-10s", "RCode");
			System.out.printf("| %-20s", "Name");
			System.out.printf("| %-10s%n", "Byear");
			rNode.getValue().hienThiReader();
		} else {
			System.out.println("Khong tim thay.");
		}
		System.out.println("Done.");

	}

	// 2.4 delete by rcode
	public static void delete() {

		System.out.println("Moi nhap vao Rcode can xoa: ");
		scan = new Scanner(System.in);
		String rcode = scan.nextLine();
		Stack list2 = new Stack();

		int k = rList.index(rcode);

		for (int i = rList.size(); i > k; i--) {
			list2.push(rList.pop());
		}

		rList.pop();

		for (int i = list2.size(); i > 0; i--) {
			rList.push(list2.pop());
		}

		System.out.println("DELETE DONE.");
	}
	
	//menu Reader
	public static void menuReader() {
		System.out.println("");
		System.out.println("2. Reader list");
		System.out.println("    2.1.    Add reader");
		System.out.println("    2.2.    Display data");
		System.out.println("    2.3.    Search by rcode");
		System.out.println("    2.4.    Delete by rcode");			
		System.out.println("");
	}

}
