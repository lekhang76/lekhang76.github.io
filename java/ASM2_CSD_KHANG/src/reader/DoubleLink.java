package reader;

public class DoubleLink {

	private ReaderNode head, tail;
	static int k;

	// contructer
	public DoubleLink() {
		head = tail = null;
	}

	// kich thuoc cua readerlist
	public int size() {
		int size = 0;
		ReaderNode current = this.head;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	// them vao head
	public void add2Head(Reader b) {
		ReaderNode newNode = new ReaderNode(b);

		if (size() == 0) {
			head = tail = newNode;
		} else {
			newNode.setPrev(null);
			newNode.setNext(head);

			head.setPrev(newNode);
			head = newNode;
		}
	}

	// them vao tail
	public void add2Tail(Reader b) {
		ReaderNode newNode = new ReaderNode(b);
		if (size() == 0) {
			head = tail = newNode;
		} else {
			newNode.setNext(null);
			newNode.setPrev(tail);

			tail.setNext(newNode);
			tail = newNode;
		}
	}

	// lay phan tu Head
	public Reader getHead() {

		Reader result = null;
		if (size() > 0) {
			ReaderNode newNode = head;
			result = newNode.getValue();
			if (size() == 1) {
				head = tail = null;
			} else {
				head = head.getNext();
				head.setPrev(null);
			}
		}
		return result;
	}

	// lay phan tu Tail
	public Reader getTail() {

		Reader result = null;
		if (size() > 0) {
			ReaderNode newNode = tail;
			result = newNode.getValue();
			if (size() == 1) {
				head = tail = null;
			} else {
				tail = tail.getPrev();
				tail.setNext(null);
			}
		}
		return result;
	}

	// hien thi
	public void display() {
		ReaderNode tmp = head;
		while (tmp != null) {
			System.out.format("%5d", tmp.getValue());
			// tmp.getValue().hienThiReader();
			tmp = tmp.getNext();
		}
	}

	// tim gia tri Node theo k
	public Reader getNode(int k) {
		return this.findNode(k).getValue();
	}

	// tim Node theo k
	public ReaderNode findNode(int k) {
		ReaderNode tmp = head;
		for (int i = 0; i < k - 1; i++) {
			tmp = tmp.getNext();
		}
		return tmp;

	}

	// Lay vi tri thu k cua Node ra 
	public int getIndex(String rcode) {
		ReaderNode tmp = head;
		while (tmp != null) {
			for (k = size();k>0; k--) {
				if (tmp.getValue().getRcode().equals(rcode)) {
					return k;
				}
				tmp = tmp.getNext();
			}
		}
		return -1;
	}

	// tim theo rcode
	public ReaderNode searchRcode(String rcode) {
		ReaderNode tmp = head;
		while (tmp != null) {
			if (tmp.getValue().getRcode().equals(rcode)) {
				return tmp;
			}
			tmp = tmp.getNext();
		}
		return null;
	}

	// xoa phan tu theo (chi so k) rcode
	public void delete(String rcode) {
		ReaderNode tmp = this.findNode(this.getIndex(rcode));
		if (tmp == head) {
			this.getHead();
			return;
		}
		if (tmp == tail) {
			this.getTail();
			return;
		}
		if (this.getIndex(rcode) < this.size() - 1 && this.size() > 2) {
			tmp.getPrev().setNext(tmp.getNext());
			tmp.getNext().setPrev(tmp.getNext());
		}
	}
	
}
