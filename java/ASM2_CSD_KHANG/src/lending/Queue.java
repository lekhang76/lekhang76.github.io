package lending;


public class Queue {
	
private DoubleLink queue=new DoubleLink();
	
	public boolean isEmpty() {
		return queue.size()==0;
	}
	
	public int size() {
		return queue.size();
	}
	
	public void enQueue(Lending x) {
		queue.add2Head(x);
	}
	
	public Lending deQueue() {
		return queue.getTail();
	}
	
	public Lending get(int i) {
		return queue.getNode(i);
	}
	
	public void display() {
		queue.display();
	}

}
