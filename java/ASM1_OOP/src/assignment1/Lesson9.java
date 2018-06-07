package assignment1;

import java.util.Scanner;

public class Lesson9 {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ma bien so xe: ");
		int x = scan.nextInt();
		while ((x <= 10) || (x >= 100)) {
			System.out.print("Day khong phai ma bien so xe. Vui long nhap lai: ");
			x = scan.nextInt();
		}
		System.out.print(x + " la ma bien so xe cua tinh ");
		switch (x) {
		case 11:
			System.out.print("Cao Bang");
			x = scan.nextInt();
			break;
		case 12:
			System.out.print("Lang Son");
			break;
		case 13:
		case 98:
			System.out.print("Bac Giang");
			break;
		case 14:
			System.out.print("Quang Ninh");
			break;
		case 15:
		case 16:
			System.out.print("Hai Phong");
			break;
		case 17:
			System.out.print("Thai Binh");
			break;
		case 18:
			System.out.print("Nam Dinh");
			break;
		case 19:
			System.out.print("Phu Tho");
			break;
		case 20:
			System.out.print("Thai Nguyen");
			break;
		case 21:
			System.out.print("Yen Bai");
			break;
		case 22:
			System.out.print("Tuyen Quang");
			break;
		case 23:
			System.out.print("Ha Giang");
			break;
		case 24:
			System.out.print("Lao Cai");
			break;
		case 25:
			System.out.print("Lai Chau");
			break;
		case 26:
			System.out.print("Son La");
			break;
		case 27:
			System.out.print("Dien Bien");
			break;
		case 28:
			System.out.print("Hoa Binh");
			break;
		case 29:
		case 30:
		case 31:
		case 32:
			System.out.print("Ha Noi");
			break;
		case 33:
			System.out.print("Ha Tay");
			break;
		case 34:
			System.out.print("Hai Duong");
			break;
		case 35:
			System.out.print("Ninh Binh");
			break;
		case 36:
			System.out.print("Thanh Hoa");
			break;
		case 37:
			System.out.print("Nghe An");
			break;
		case 38:
			System.out.print("Ha Tinh");
			break;
		case 43:
			System.out.print("Da Nang");
			break;
		case 47:
			System.out.print("Dak Lak");
			break;
		case 48:
			System.out.print("Dak Nong");
			break;
		case 49:
			System.out.print("Lam Dong");
			break;
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
			System.out.print("Thanh pho Ho Chi Minh");
			break;
		case 60:
			System.out.print("Dong Nai");
			break;
		case 61:
			System.out.print("Binh Duong");
			break;
		case 62:
			System.out.print("Long An");
			break;
		case 63:
			System.out.print("Tien Giang");
			break;
		case 64:
			System.out.print("Vinh Long");
			break;
		case 65:
			System.out.print("Can Tho");
			break;
		case 66:
			System.out.print("Dong Thap");
			break;
		case 67:
			System.out.print("An Giang");
			break;
		case 68:
			System.out.print("Kien Giang");
			break;
		case 69:
			System.out.print("Ca Mau");
			break;
		case 70:
			System.out.print("Tay Ninh");
			break;
		case 71:
			System.out.print("Ben Tre");
			break;
		case 72:
			System.out.print("Ba Ria Vung Tau");
			break;
		case 73:
			System.out.print("Quang Binh");
			break;
		case 74:
			System.out.print("Quang Tri");
			break;
		case 75:
			System.out.print("Hue");
			break;
		case 76:
			System.out.print("Quang Ngai");
			break;
		case 77:
			System.out.print("Binh Dinh");
			break;
		case 78:
			System.out.print("Phu Yen");
			break;
		case 79:
			System.out.print("Khanh Hoa");
			break;
		case 81:
			System.out.print("Gia Lai");
			break;
		case 82:
			System.out.print("Kon Tum");
			break;
		case 83:
			System.out.print("Soc Trang");
			break;
		case 84:
			System.out.print("Tra Vinh");
			break;
		case 85:
			System.out.print("Ninh Thuan");
			break;
		case 86:
			System.out.print("Binh Thuan");
			break;
		case 88:
			System.out.print("Vinh Phuc");
			break;
		case 89:
			System.out.print("Hung yen");
			break;
		case 90:
			System.out.print("Ha nam");
			break;
		case 92:
			System.out.print("Quang Nam");
			break;
		case 93:
			System.out.print("Binh Phuoc");
			break;
		case 94:
			System.out.print("Bac Lieu");
			break;
		case 95:
			System.out.print("Hau Giang");
			break;
		case 97:
			System.out.print("Bac Kan");
			break;
		case 99:
			System.out.print("Bac Ninh");
			break;
		}
	}
}
