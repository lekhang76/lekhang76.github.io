package lending;

public class Lending {

	private String bcode, rcode;
	private int state;

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Lending() {

	}

	public Lending(String rcode, String name, int byear) {
		this.bcode = rcode;
		this.rcode = name;
		this.state = byear;
	}

	public void hienThiLending() {

		System.out.printf("| %-10s", this.getBcode());
		System.out.printf("| %-20s", this.getRcode());
		System.out.printf("| %-10d%n", this.getState());

	}

}
