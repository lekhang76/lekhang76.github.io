package entity;

import business.PhuCapLuong;
import business.MyEnum.listChucVu;
import business.MyEnum.listTrinhDo;

/**
 * Khai bao doi tuong can bo
 *
 */
public abstract class CanBo implements PhuCapLuong {

	private int id;
	private String hoTen;
	private double heSoLuong;
	private String donViLamViec;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getDonViLamViec() {
		return donViLamViec;
	}

	public void setDonViLamViec(String donViLamViec) {
		this.donViLamViec = donViLamViec;
	}

	public CanBo() {

	}

	public CanBo(int id) {
		this.id = id;
	}
	
	public abstract void hienThiTT_CanBo();
	
	public abstract listTrinhDo getTrinhDo();
	public abstract listChucVu getChucVu();
	public abstract int getSoTietDay();
	public abstract int getSoNgayLam();


}
