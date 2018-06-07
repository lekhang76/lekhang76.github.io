package reader;

public class Reader {

	private String rcode, name;
	private int byear;

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public Reader() {

	}

	public Reader(String rcode, String name, int byear) {
		this.rcode = rcode;
		this.name = name;
		this.byear = byear;
	}

	public void hienThiReader() {

		System.out.printf("| %-10s", this.getRcode());
		System.out.printf("| %-20s", this.getName());
		System.out.printf("| %-10d%n", this.getByear());

	}

}
