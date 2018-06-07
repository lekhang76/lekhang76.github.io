package ui;

import java.util.ArrayList;
import java.util.Scanner;

import entity.CanBo;

/**
 * Tao menu quan li
 *
 */

public class Menu {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<CanBo> cb = new ArrayList<CanBo>();
	static boolean test = false;
	static int luaChon;

	public static void menu() {

		do {
			do {
				HienThi.hienThiMenu();
				test = false;
				try {
					luaChon = Integer.parseInt(scanner.nextLine());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");

				}
			} while (!test);

			switch (luaChon) {
			case 1:
				QuanLy.nhap();
				break;
			case 2:
				System.out.println("nhap ten can bo can tim: ");
				String t = scanner.nextLine();
			    HienThi.hienThiTieuDe();
				QuanLy.timTen(t);
				break;
			case 3:
				QuanLy.timDonViLamViec();
				break;
			case 4:
				QuanLy.xepTheoTen();
				break;
			case 5:
				QuanLy.ghiRaFileDuLieu();
				break;
			}
		} while (0 < luaChon && luaChon < 6);
		System.out.println("*********** CHUONG TRINH KET THUC! ************");
	}

}
