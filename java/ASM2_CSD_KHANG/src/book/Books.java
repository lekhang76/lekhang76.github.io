package book;

public class Books {

	private String bcode, title;
	private int quantity, lended;
	private double price;

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLended() {
		return lended;
	}

	public void setLended(int lended) {
		this.lended = lended;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getValue() {
		return getPrice()*getQuantity();
	}
	
	public Books() {

	}

	public Books(String bcode, String title, int quantity, int lended, double price) {
		this.bcode = bcode;
		this.title = title;
		this.quantity = quantity;
		this.lended = lended;
		this.price = price;
	}

	public void hienThiBooks() {
		
		System.out.printf("| %-10s", getBcode());
		System.out.printf("| %-20s", getTitle());
		System.out.printf("| %-10d", getQuantity());
		System.out.printf("| %-10d", getLended());
		System.out.printf("| %-10s", getPrice());
		System.out.printf("| %-10s%n", getValue());
		
	}

}
