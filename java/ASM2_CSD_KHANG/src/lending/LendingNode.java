package lending;

import lending.Lending;

public class LendingNode {

	private Lending value;
	private LendingNode next;
	private LendingNode prev;

	public Lending getValue() {
		return value;
	}

	public void setValue(Lending value) {
		this.value = value;
	}

	public LendingNode getNext() {
		return next;
	}

	public void setNext(LendingNode next) {
		this.next = next;
	}

	public LendingNode getPrev() {
		return prev;
	}

	public void setPrev(LendingNode prev) {
		this.prev = prev;
	}

	public LendingNode() {

	}

	public LendingNode(Lending b) {
		this.value = b;
		setNext(null);
		setPrev(null);
	}

	public LendingNode(Lending x, LendingNode prev, LendingNode next) {
		this.value = x;
		setNext(null);
		setPrev(null);
	}

}
