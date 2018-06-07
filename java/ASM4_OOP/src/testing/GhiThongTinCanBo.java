package testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import entity.CanBo;

public class GhiThongTinCanBo {

	public void ghiDanhSachCanBo(ArrayList<CanBo> cb) {

		File file = new File("output.txt");
		try (FileWriter fr = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fr);
				PrintWriter pr = new PrintWriter(bw)) {
			pr.println("-- Danh sach tat ca can bo cua truong --");
			pr.printf(" |%5s |", "STT");
			pr.printf("%10s |", "Ho ten");
			pr.printf("%10s |", "Phong khoa");
			pr.printf("%12s |", "He so luong");
			pr.printf("%17s |", "Trinh do/ Chuc vu");
			pr.printf("%7s |", "Phu cap");
			pr.printf("%17s |", "So ngay / So tiet");
			pr.printf("%5s%n |", "Luong");

			for (CanBo x : cb) {
				if (x.getSoTietDay() != 0) {

//					x.hienThiTT_CanBo();

					pr.printf("%5d |", x.getId());
					pr.printf("%10s |", x.getHoTen());
					pr.printf("%10s |", x.getDonViLamViec());
					pr.printf("%12f |", x.getHeSoLuong());
					pr.printf("%17s |", x.getTrinhDo());
					pr.printf("%7s |", x.getPhuCap());
					pr.printf("%17d |", x.getSoTietDay());
					pr.printf("%5s%n |", x.getLuong());

				} else {
					
//					x.hienThiTT_CanBo();

					pr.printf("%5d |", x.getId());
					pr.printf("%10s |", x.getHoTen());
					pr.printf("%10s |", x.getDonViLamViec());
					pr.printf("%12f |", x.getHeSoLuong());
					pr.printf("%17s |", x.getChucVu());
					pr.printf("%7s |", x.getPhuCap());
					pr.printf("%17d |", x.getSoNgayLam());
					pr.printf("%5s%n |", x.getLuong());

				}
			}
			System.out.println("Ghi du lieu ra file hoan tat");
			pr.close();

		} catch (Exception e) {

		}
	}

}
