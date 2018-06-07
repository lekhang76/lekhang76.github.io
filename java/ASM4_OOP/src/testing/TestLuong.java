package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import business.MyEnum.listChucVu;
import business.MyEnum.listTrinhDo;
import entity.GiangVien;
import entity.NhanVienHanhChinh;

public class TestLuong {
	
	static GiangVien a = new GiangVien();
	static NhanVienHanhChinh nv = new NhanVienHanhChinh();


	@Test
	public void testLuongCuNhan() {

		a.setTrinhDo(listTrinhDo.CU_NHAN);
		a.setHeSoLuong(2);
		a.setSoTietDay(50);

		assertEquals(4010.0, a.getLuong());

	}
	
	@Test
	public void testLuongTienSi() {

		a.setTrinhDo(listTrinhDo.TIEN_SI);
		a.setHeSoLuong(2);
		a.setSoTietDay(50);

		assertEquals(4710.0, a.getLuong());

	}
	
	@Test
	public void testLuongThacSi() {

		a.setTrinhDo(listTrinhDo.THAC_SI);
		a.setHeSoLuong(1.2);
		a.setSoTietDay(10);

		assertEquals(1826.0, a.getLuong());

	}
	
	@Test
	public void testLuongTruongPhong() {

		nv.setChucVu(listChucVu.TRUONG_PHONG);
		nv.setHeSoLuong(3);
		nv.setSoNgayLam(30);

		assertEquals(5090.0, nv.getLuong());

	}
	
	@Test
	public void testLuongNhanVien() {

		nv.setChucVu(listChucVu.NHAN_VIEN);
		nv.setHeSoLuong(2);
		nv.setSoNgayLam(20);

		assertEquals(2560.0, nv.getLuong());

	}

}
