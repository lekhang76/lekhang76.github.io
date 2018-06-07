package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import business.*;

import business.MyEnum.*;
import entity.CanBo;
import entity.GiangVien;
import entity.NhanVienHanhChinh;
import testing.GhiThongTinCanBo;

/**
 * Nhap thong tin can bo - Tim kiem - Sap xep can bo theo ten
 *
 */
public class QuanLy {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<CanBo> cb = new ArrayList<CanBo>();

	static int id = 1, luaChon;
	static boolean test = false;

	public static void nhap() {
		do {
			System.out.print("Chon loai can bo (1 - Giang vien, 2 - Nhan vien): ");
			test = true;
			try {
				luaChon = Integer.parseInt(scanner.nextLine());
				test = true;
			} catch (Exception e) {
				System.out.println("Da xay ra loi, vui long nhap lai");

			}
		} while (!test);

		/**
		 * Nhap thong tin giang vien
		 *
		 */
		
		switch (luaChon) {
		case 1:
			CanBo gv = new GiangVien(id);

			System.out.print("nhap ten giang vien: ");
			gv.setHoTen(inputTen());
			System.out.print("Nhap khoa: ");
			gv.setDonViLamViec(inputKhoa());

			do {
				System.out.print("He so luong: ");
				test = false;
				try {
					gv.setHeSoLuong(inputHsluong());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");

				}
			} while (!test);

			do {
				System.out.print("Nhap so tiet day:");
				test = false;
				try {
					((GiangVien) gv).setSoTietDay(inputSoTiet());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");

				}
			} while (!test);

			do {
				System.out.println("Chon trinh do: 1/ Cu nhan - 2/Thac si - 3/ Tien si");
				test = false;
				try {
					((GiangVien) gv).setTrinhDo(inputTrinhDo());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");

				}
			} while (!test);
			
			cb.add(gv);
			
			id++;
			break;

			/**
			 * Nhap thong tin giang vien
			 * 
			 */

		case 2:
			CanBo nv = new NhanVienHanhChinh(id);

			System.out.print("Nhap ten nhan vien hanh chinh: ");
			nv.setHoTen(inputTen());
			System.out.print("Nhap phong: ");
			nv.setDonViLamViec(inputPhong());

			do {
				System.out.print("He so luong: ");
				test = false;
				try {
					nv.setHeSoLuong(inputHsluong());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");
				}
			} while (!test);

			do {
				System.out.print("Nhap so ngay lam viec: ");
				test = false;
				try {
					((NhanVienHanhChinh) nv).setSoNgayLam(inputNgayCong());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");
				}
			} while (!test);

			do {
				System.out.print("Chon chuc vu:1/ Nhan vien - 2/ Pho phong - 3/ Truong phong ");
				test = false;
				try {
					((NhanVienHanhChinh) nv).setChucVu(inputChucVu());
					test = true;
				} catch (Exception e) {
					System.out.println("Da xay ra loi, vui long nhap lai");
				}
			} while (!test);

			cb.add(nv);
			id++;

		break;
		}
		
	}
	
	public static void ghiRaFileDuLieu() {
	
		GhiThongTinCanBo n = new GhiThongTinCanBo();
		n.ghiDanhSachCanBo(cb);
	}

	private static String inputTen() {
		return scanner.nextLine();
	}

	private static String inputKhoa() {
		return scanner.nextLine();
	}

	private static double inputHsluong() {
		return Double.parseDouble(scanner.nextLine());
	}

	private static int inputSoTiet() {
		return Integer.parseInt(scanner.nextLine());
	}

	private static listTrinhDo inputTrinhDo() {
		int x;
		listTrinhDo list = null;
		do {
			x = Integer.parseInt(scanner.nextLine());
			switch (x) {
			case 1:
				list = listTrinhDo.CU_NHAN;
				break;
			case 2:
				list = listTrinhDo.THAC_SI;
				break;
			case 3:
				list = listTrinhDo.TIEN_SI;
				break;
			}
		} while (x < 0 || x > 3);
		
		return list;
	}

	private static String inputPhong() {
		return scanner.nextLine();
	}

	private static int inputNgayCong() {
		return Integer.parseInt(scanner.nextLine());
	}

	private static listChucVu inputChucVu() {
		int x;
		listChucVu list = null;
		do {
			x = Integer.parseInt(scanner.nextLine());
			switch (x) {
			case 1:
				list = listChucVu.NHAN_VIEN;
				break;
			case 2:
				list = listChucVu.PHO_PHONG;
				break;
			case 3:
				list = listChucVu.TRUONG_PHONG;
				break;
			}
		} while (x < 0 || x > 3);
		
		return list;
	}

	/**
	 * Tim thong tin can bo theo ten
	 * 
	 */
	
	public static ArrayList<CanBo> timTen(String t) { 
		ArrayList<CanBo> result= new ArrayList<CanBo>();
	    for (CanBo x: cb) {
	        if (t.equals(x.getHoTen())){   	
	        	 result.add(x);
	        }
	    }
	    	 return result;
	    }

	/**
	 * Tim thong tin can bo theo don vi lam viec
	 * 
	 */

	public static void timDonViLamViec() {
		System.out.println("nhap don vi lam viec can tim:");
		String p = scanner.nextLine();
		int dem2 = 0;
		HienThi.hienThiTieuDe();
		for (CanBo x : cb) {
			if (p.equalsIgnoreCase(x.getDonViLamViec())) {
				x.hienThiTT_CanBo();
				dem2++;
			}
		}
		if (dem2 == 0) {
			System.out.println("Khong tim thay don vi lam viec!");
		}
	}

	/**
	 * Sap xep thong tin can bo theo ten
	 *
	 */

	public static void xepTheoTen() {
		Collections.sort(cb, new Comparator<CanBo>() {
			@Override
			public int compare(CanBo cb1, CanBo cb2) {

				return (cb1.getHoTen().compareTo(cb2.getHoTen()));
			}
		});
		HienThi.hienThiTieuDe();
		for (CanBo x : cb) {
			x.hienThiTT_CanBo();
		}
	}

}
