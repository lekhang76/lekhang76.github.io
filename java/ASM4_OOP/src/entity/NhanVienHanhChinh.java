package entity;

import business.MyEnum;
import business.PhuCapLuong;
import business.MyEnum.listChucVu;
import business.MyEnum.listTrinhDo;

/**
 * Khai bao doi tuong nhan vien hanh chinh
 *
 */

public class NhanVienHanhChinh extends CanBo implements PhuCapLuong {
	
	private int soNgayLam;
	private listChucVu chucVu;

	
	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}

	public listChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(listChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public int getPhuCap() {
		switch (getChucVu()) {
		case NHAN_VIEN:
			return 500;
		case PHO_PHONG:
			return 1000;
		case TRUONG_PHONG:
			return 2000;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong()*730+getPhuCap()+getSoNgayLam()*30;
	}

	

	public NhanVienHanhChinh() {
		super();
	}
	
	public NhanVienHanhChinh(int id) {
		super(id);
	}
	
	@Override
	public void hienThiTT_CanBo() {
		
		System.out.format("%5d | ", getId());
        System.out.format("%15s | ", getHoTen());
        System.out.format("%10s | ", getDonViLamViec());
        System.out.format("%12f | ", getHeSoLuong());
		System.out.format("%17s | ", getChucVu());
		System.out.format("%7s | ", getPhuCap());
		System.out.format("%17d | ", getSoNgayLam());
		System.out.format("%5f%n", getLuong());
	}

	@Override
	public listTrinhDo getTrinhDo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSoTietDay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

