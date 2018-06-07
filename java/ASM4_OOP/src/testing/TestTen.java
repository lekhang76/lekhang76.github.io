package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entity.CanBo;

public class TestTen {

	static CanBo cb;

	@Test
	public void testHoTen() {
		
		String a = "Khang";
		int n=(ui.QuanLy.timTen(a)).size();
		assertEquals(0, n);
	}

	@Test
	public void testHoTenCanBo() {

		String a = "NAM";
		int n=(ui.QuanLy.timTen(a)).size();
		assertEquals(0, n);
		
	}
}
