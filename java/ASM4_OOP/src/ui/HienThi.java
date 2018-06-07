package ui;

/**
 * Hien thi
 *
 */

public class HienThi {

/**
 * Hien thi tieu de cua danh sach
 *
 */
	
	public static void hienThiTieuDe() {
		
		System.out.format("%5s | ", "STT");
		System.out.format("%15s | ", "Ho ten");
		System.out.format("%10s | ", "Phong/Khoa");
		System.out.format("%12s | ", "He so luong");
		System.out.format("%17s | ", "Trinh do/Chuc vu");
		System.out.format("%7s | ", "Phu cap");
		System.out.format("%17s | ", "Ngay cong/So tiet");
		System.out.format("%5s%n", "Luong");

	}
	
	/**
	 * Hien Thi menu chon
	 *
	 */
	
	 public static void hienThiMenu() {
		 
	        System.out.println("================* Quan ly danh sach can bo *================");
	        System.out.println("|    1. Nhap danh sach can bo.                              |");
	        System.out.println("|    2. Tim can bo theo ten.                                |");
	        System.out.println("|    3. Tim can bo theo phong/khoa.                         |");
	        System.out.println("|    4. Danh sach can bo theo ten.                          |");
	        System.out.println("|    5. In toan bo danh sach nhan vien vao file du lieu.    |");
	        System.out.println("|    6. Thoat.                                              |");
	        System.out.println("*===========================================================*");
	        System.out.print("Moi nhap lua chon cua ban: ");
	    }

}
