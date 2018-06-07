package book;

import book.Books;

public class DoubleLink {

	private BooksNode head, tail;
	private int size;

	// contructer
	public DoubleLink() {
		head = tail = null;
		this.size = 0;
	}

	// kich thuoc cua bookslist
	public int size() {
		return this.size;
	}

	// them vao head
	public void add2Head(Books b) {
		BooksNode newNode = new BooksNode(b);
		if (size() == 0) {
			head = tail = newNode;

			} else {
				newNode.setPrev(null);
				newNode.setNext(head);

				head.setPrev(newNode);
				head = newNode;
			}	
		this.size++;

	}

	// them vao tail
	public void add2Tail(Books b) {
		BooksNode newNode = new BooksNode(b);
		if (size() == 0) {
			head = tail = newNode;
			
			} else {
				newNode.setNext(null);
				newNode.setPrev(tail);

				tail.setNext(newNode);
				tail = newNode;
		}
		this.size++;

	}

	// lay phan tu Head
	public Books getHead() {

		Books result = null;
		if (size() > 0) {
			BooksNode newNode = head;
			result = newNode.getValue();
			if (size() == 1) {
				head = tail = null;
			} else {
				head = head.getNext();
				head.setPrev(null);
			}
		}
		this.size--;
		return result;
	}

	// lay phan tu Tail
	public Books getTail() {

		Books result = null;
		if (size() > 0) {
			BooksNode newNode = tail;
			result = newNode.getValue();
			if (size() == 1) {
				head = tail = null;
			} else {
				tail = tail.getPrev();
				tail.setNext(null);
			}
		}
		this.size--;
		return result;
	}

	// hien thi
	public void display() {
		BooksNode tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getValue());
			tmp = tmp.getNext();
		}
	}

	// tim theo bcode
	public BooksNode searchBcode(String bcode) {
		BooksNode tmp = head;
		while (tmp != null) {
			if (tmp.getValue().getBcode().equalsIgnoreCase(bcode)) {
				return tmp;
			}
			tmp = tmp.getNext();
		}
		return null;
	}

	// tim gia tri Node theo k
	public Books getNode(int k) {
		return this.findNode(k).getValue();
	}

	// tim Node theo k
	public BooksNode findNode(int k) {
		BooksNode tmp = head;
		for (int i = 0; i < k; i++) {
			tmp = tmp.getNext();
		}
		return tmp;

	}

	// xoa tat ca du lieu
	public void clean() {
		head = tail = null;

	}

	// Them 1 phan tu vao vi tri thu k
	public void add(int k, Books b) {
		BooksNode newNode = new BooksNode();
		BooksNode nodeK = this.findNode(k);
		if (nodeK == tail) {
			this.add2Tail(b);
			return;
		}
		if (nodeK == head) {
			this.add2Head(b);
			return;
		} else {
			nodeK.setNext(newNode);
			newNode.setNext(nodeK.getNext());
			newNode.setPrev(nodeK);
			nodeK.getNext().setPrev(newNode);
		}
		this.size++;

	}

	// xoa phan tu theo chi so k
	public void delete(int k) {	
		BooksNode tmp = this.findNode(k);
		if (tmp == head) {
			this.getHead();
			size--;
			return;
		}
		if (tmp == tail) {
			this.getTail();
			size--;
			return;
		}
		if (k < this.size() - 1 && this.size() > 2) {
			tmp.getPrev().setNext(tmp.getNext());
			tmp.getNext().setPrev(tmp.getNext());
		}
		this.size--;
	}

}
