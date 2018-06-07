package book;

import book.Books;

public class BooksNode {

	private Books value;
	private BooksNode next;
	private BooksNode prev;

	public Books getValue() {
		return value;
	}

	public void setValue(Books value) {
		this.value = value;
	}

	public BooksNode getNext() {
		return next;
	}

	public void setNext(BooksNode next) {
		this.next = next;
	}

	public BooksNode getPrev() {
		return prev;
	}

	public void setPrev(BooksNode prev) {
		this.prev = prev;
	}

	public BooksNode() {

	}

	public BooksNode(Books b) {
		this.value = b;
		setNext(null);
		setPrev(null);
	}

	public BooksNode(Books x, BooksNode prev, BooksNode next) {
		this.value = x;
		setNext(null);
		setPrev(null);
	}

}
