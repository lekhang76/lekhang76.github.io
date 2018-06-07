package book;

import java.util.Scanner;

public class BooksManager {
	public static DoubleLink blist = new DoubleLink();
	static Scanner scan = new Scanner(System.in);
	static boolean test;
	static int luaChon;

	// 1.1 nhap va them vao cuoi
	public static void inputAdd2End() {
		Books book = new Books();

		System.out.println();
		System.out.println("Nhap Book vao cuoi danh sach:");

		System.out.print("BCode: ");
		scan = new Scanner(System.in);
		String bcode = scan.nextLine();
		while (blist.searchBcode(bcode) != null) {
			System.out.println("Bcode da ton tai, vui long nhap lai");
			bcode = scan.nextLine();
		}
		while ("".equals(bcode)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			bcode = scan.nextLine();
		}
		System.out.println("Done.");
		book.setBcode(bcode);

		System.out.print("Title: ");
		String title = scan.nextLine();
		while ("".equals(title)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			title = scan.nextLine();
		}
		System.out.println("Done.");
		book.setTitle(title);

		System.out.print("Quantity: ");
		book.setQuantity(inputQuantity());

		System.out.print("Lended: ");
		int lended = Integer.parseInt(scan.nextLine());
		while (book.getLended() > book.getQuantity()) {
			System.out.println("Dieu kien: lended <= quantity");
			lended = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Done.");
		book.setLended(lended);

		System.out.print("Price: ");
		book.setPrice(inputPrice());

		blist.add2Tail(book);
		System.out.println("Add done.");

	}

	// 1.2 Display data
	public static void displayData() {

		// System.out.println(blist.size());

		System.out.println();
		System.out.printf("| %-10s", "BCode");
		System.out.printf("| %-20s", "Title");
		System.out.printf("| %-10s", "Quantity");
		System.out.printf("| %-10s", "Lended");
		System.out.printf("| %-10s", "Price");
		System.out.printf("| %-10s%n", "Value");

		for (int i = 0; i < blist.size(); i++) {
			blist.getNode(i).hienThiBooks();
		}
	}

	// 1.3 Search by bcode

	public static void timBcode() {
		System.out.println("nhap vao bcode can tim");
		scan = new Scanner(System.in);
		String bcode = scan.nextLine();
		if (blist.searchBcode(bcode) != null) {
			System.out.printf("| %-10s", "BCode");
			System.out.printf("| %-20s", "Title");
			System.out.printf("| %-10s", "Quantity");
			System.out.printf("| %-10s", "Lended");
			System.out.printf("| %-10s", "Price");
			System.out.printf("| %-10s%n", "Value");

			blist.searchBcode(bcode).getValue().hienThiBooks();
		} else {
			System.out.println("Data not found");
		}

		System.out.println("Search done.");
	}

	// 1.4 Input & add to the beginning
	public static void inputAdd2Begin() {
		Books book = new Books();

		System.out.println();
		System.out.println("Nhap Book vao dau cua danh sach:");

		System.out.print("BCode: ");
		scan = new Scanner(System.in);
		String bcode = scan.nextLine();
		while (blist.searchBcode(bcode) != null) {
			System.out.println("Bcode da ton tai, vui long nhap lai");
			bcode = scan.nextLine();
		}
		while ("".equals(bcode)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			bcode = scan.nextLine();
		}
		System.out.println("Done.");
		book.setBcode(bcode);

		System.out.print("Title: ");
		String title = scan.nextLine();
		while ("".equals(title)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			title = scan.nextLine();
		}
		System.out.println("Done.");
		book.setTitle(title);

		System.out.print("Quantity: ");
		book.setQuantity(inputQuantity());

		System.out.print("Lended: ");
		int lended = Integer.parseInt(scan.nextLine());
		while (book.getLended() > book.getQuantity()) {
			System.out.println("Dieu kien: lended <= quantity");
			lended = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Done.");
		book.setLended(lended);

		System.out.print("Price: ");
		book.setPrice(inputPrice());

		blist.add2Head(book);
	}
	// 1.5 Them phan tu vao vi tri thu k

	public static void addtoK() {
		System.out.print("Nhap vao vi tri can them vao k= ");
		int k = Integer.parseInt(scan.nextLine());

		while (k < 0 || k >= blist.size()) {
			System.out.print("Moi nhap lai vi tri k (dieu kien: k>=0 & k<length): ");
			k = Integer.parseInt(scan.nextLine());
		}

		Books book = new Books();

		System.out.println();
		System.out.println("Nhap Book vao vi tri thu k cua danh sach:");

		System.out.print("BCode: ");
		scan = new Scanner(System.in);
		String bcode = scan.nextLine();
		while (blist.searchBcode(bcode) != null) {
			System.out.println("Bcode da ton tai, vui long nhap lai");
			bcode = scan.nextLine();
		}
		while ("".equals(bcode)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			bcode = scan.nextLine();
		}
		System.out.println("Done.");
		book.setBcode(bcode);

		System.out.print("Title: ");
		String title = scan.nextLine();
		while ("".equals(title)) {
			System.out.println("Da xay ra loi, vui long nhap chuoi khac rong:");
			title = scan.nextLine();
		}
		System.out.println("Done.");
		book.setTitle(title);

		System.out.print("Quantity: ");
		book.setQuantity(inputQuantity());

		System.out.print("Lended: ");
		int lended = Integer.parseInt(scan.nextLine());
		while (book.getLended() > book.getQuantity()) {
			System.out.println("Dieu kien: lended <= quantity");
			lended = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Done.");
		book.setLended(lended);

		System.out.print("Price: ");
		book.setPrice(inputPrice());

		blist.add(k, book);

	}

	// 1.6 Delete position k
	public static void delete() {
		System.out.print("Nhap vao vi tri k can xoa: ");

		int k = Integer.parseInt(scan.nextLine());
		while (k < 0 || k >= blist.size()) {
			System.out.print("Nhap lai so k (Dieu kien: k>=0 & k<size): ");
			k = Integer.parseInt(scan.nextLine());
		}
		blist.delete(k);
	}

	private static int inputQuantity() {
		return Integer.parseInt(scan.nextLine());
	}

	private static double inputPrice() {
		return Double.parseDouble(scan.nextLine());
	}

	public static void menuBook() {

		System.out.println("");
		System.out.println("1. Book list:");
		System.out.println("    1.1.    Input & add to the end");
		System.out.println("    1.2.    Display data");
		System.out.println("    1.3.    Search by bcode");
		System.out.println("    1.4.    Input & add to beginning");
		System.out.println("    1.5.    Add after position k");
		System.out.println("    1.6.    Delete posotion k");
		System.out.println("");
	}
}
