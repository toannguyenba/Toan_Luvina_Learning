package unit4.bai_tap_ve_nha;

public class Node {
	private int data;
	private Node next;
	
	public Node(int value) {
		this(value, null);
	}
	
	public Node(int value, Node node) {
		this.data = value;
		this.next = node;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
}
