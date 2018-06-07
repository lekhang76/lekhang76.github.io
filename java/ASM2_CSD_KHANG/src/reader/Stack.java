package reader;

public class Stack {

	private DoubleLink stack = new DoubleLink();

	public boolean isEmpty() {
		return stack.size() == 0;
	}

	public int size() {
		return stack.size();
	}

	public void push(Reader x) {
		stack.add2Head(x);
	}

	public Reader pop() {
		return stack.getHead();
	}

	public Reader get(int i) {
		return stack.getNode(i);
	}

	public void display() {
		stack.display();
	}

	public ReaderNode searchByRcode(String rcode) {
		return stack.searchRcode(rcode);
	}
	
	public int index(String rcode) {
		return stack.getIndex(rcode);
	}
	
}
