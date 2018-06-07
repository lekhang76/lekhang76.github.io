package entity;

import business.MyEnum;
import business.PhuCapLuong;
import business.MyEnum.listChucVu;
import business.MyEnum.listTrinhDo;

/**
 * Khai bao doi tuong Giang vien
 *
 */

public class GiangVien extends CanBo implements PhuCapLuong {
	private int soTietDay;
	private listTrinhDo trinhDo;


	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public listTrinhDo getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(listTrinhDo trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getPhuCap() {
		switch (getTrinhDo()) {
		case CU_NHAN:
			return 300;
		case THAC_SI:
			return 500;
		case TIEN_SI:
			return 1000;
		}
		return 0;
	}


	public double getLuong() {
		return getHeSoLuong()*730+getPhuCap()+getSoTietDay()*45;
	}


	public GiangVien() {

	}

	public GiangVien(int id) {
		super(id);
	}

	@Override
	public void hienThiTT_CanBo() {
		// TODO Auto-generated method stub
		System.out.format("%5d | ", getId());
		System.out.format("%15s | ", getHoTen());
		System.out.format("%10s | ", getDonViLamViec());
		System.out.format("%12f | ", getHeSoLuong());
		System.out.format("%17s | ", getTrinhDo());
		System.out.format("%7s | ", getPhuCap());
		System.out.format("%17d | ", getSoTietDay());
		System.out.format("%5f%n", getLuong());
	}

	@Override
	public listChucVu getChucVu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSoNgayLam() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public static void main(String[] args) {
		
	}
}
