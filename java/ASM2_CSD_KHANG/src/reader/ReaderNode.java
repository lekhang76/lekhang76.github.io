package reader;

import reader.Reader;

public class ReaderNode {

	private Reader value;
	private ReaderNode next;
	private ReaderNode prev;

	public Reader getValue() {
		return value;
	}

	public void setValue(Reader value) {
		this.value = value;
	}

	public ReaderNode getNext() {
		return next;
	}

	public void setNext(ReaderNode next) {
		this.next = next;
	}

	public ReaderNode getPrev() {
		return prev;
	}

	public void setPrev(ReaderNode prev) {
		this.prev = prev;
	}

	public ReaderNode() {

	}

	public ReaderNode(Reader b) {
		this.value = b;
		setNext(null);
		setPrev(null);
	}

	public ReaderNode(Reader x, ReaderNode prev, ReaderNode next) {
		this.value = x;
		setNext(null);
		setPrev(null);
	}

}
