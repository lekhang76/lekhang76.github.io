package lending;

import java.util.Scanner;

public class DoubleLink {

	static Scanner scan = new Scanner(System.in);

	private LendingNode head, tail;

	// contructer
	public DoubleLink() {
		head = tail = null;
	}

	// kich thuoc cua Lendinglist
	public int size() {
		int size = 0;
		LendingNode current = this.head;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	// them vao head
	public void add2Head(Lending b) {
		LendingNode newNode = new LendingNode(b);

		if (size() == 0) {
			head = tail = newNode;
		} else {
			newNode.setNext(head);
			
			head.setPrev(newNode);
			head = newNode;
			head.setPrev(null);
		}
	}

	// them vao tail
	public void add2Tail(Lending b) {
		LendingNode newNode = new LendingNode(b);
		if (size() == 0) {
			head = tail = newNode;
		} else {
			newNode.setPrev(tail);
			
			tail.setNext(newNode);
			tail = newNode;
			tail.setNext(null);
		}
	}

	// lay phan tu Head
	public Lending getHead() {

		Lending result = null;
		if (size() > 0) {
			LendingNode newNode = head;
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
	public Lending getTail() {

		Lending result = null;
		if (size() > 0) {
			LendingNode newNode = tail;
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
		LendingNode tmp = head;
		while (tmp != null) {
			System.out.format("%5d", tmp.getValue());
			tmp = tmp.getNext();
		}
	}

	// tim theo bcode
	public LendingNode searchByBcode(String bcode) {
		LendingNode tmp = head;
		while (tmp != null) {
			if (tmp.getValue().getBcode() == bcode) {
				return tmp;
			}
			tmp = tmp.getNext();
		}
		return null;
	}

	// Lay Value cua Node thu k ra
	public Lending getNode(int k) {
		LendingNode tmp = head;
		for (int i = 0; i < k - 1; i++) {
			tmp = tmp.getNext();
		}
		return tmp.getValue();
	}

	// tim Node theo k
	public LendingNode findNode(int k) {
		LendingNode tmp = head;
		for (int i = 0; i < k - 1; i++) {
			tmp = tmp.getNext();
		}
		return tmp;
	}

}
