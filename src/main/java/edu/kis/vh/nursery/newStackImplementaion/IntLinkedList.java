package edu.kis.vh.nursery.newStackImplementaion;

/**
 * @author modyfikował Piotr Marczewski 
 */
public class IntLinkedList implements StackInterface{

	public Node last;
	private int i;
	private int size = 0;
	
	/**
	 * @param i Parametr stosowany w metodzie push, jest to wartość jaka jest dodawana do listy.
	 */
	@Override
	public void countIn(int i) {
		if (last == null){
			last = new Node(i);
			size++;
		}		
		else {
			last.next = new Node(i);
			last.next.setPrev(last);
			last = last.next;
			size++;
		}
	}
	
	/**
	 * @return Zwraca wartość boolean true jeśli lista jest pusta.
	 */
	@Override
	public boolean callCheck() {
		if(last == null) return true;
		else return false;
	}
	
	/**
	 * @return Zwraca wartość boolean true jeśli lista jest zapełniona.
	 */
	@Override
	public boolean isFull() {
		if(size == 12) return true;
		else return false;
	}
	
	/**
	 * @return Metoda zwraca ostatnio dodaną wartość do listy.
	 */
	
	public int peekaboo() {
		if (callCheck())
			return 0;
		return last.value;
	}
	
	/**
	 * @return Metoda zdejmuje jeden element z listy.
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return 0;
		int ret = last.value;
		last = last.getPrev();
		size--;
		return ret;
	}
	
	/**
	 * @return Metoda zwraca parametr i.
	 */
	
	protected int getI() {
		return i;
	}
	
	/**
	 * @return Metoda zwraca last.
	 */
	
	Node getLast() {
		return last;
	}
}

class Node {
	protected final int value;
	private  Node prev;
	protected Node next;

	protected Node(int i) {
		value = i;
	}
	
	protected Node getPrev() {
		return prev;
	}
	
	/**
	 * @return Metoda zwraca wartość prev. 
	 */
	protected void setPrev(Node prev) {
		this.prev = prev;
	}	
}
