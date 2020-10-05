package unit4.bai_tap_ve_nha;

public class DanhSach {
	private Node first;
	private Node last;

	public DanhSach() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertAtFront(int value) {
		if(isEmpty()) { // neu list chua dc khoi tao thi nut dau = nut cuoi
			first = last = new Node(value);
		} else {
			first = new Node(value, first);
		}
	}
	
	public void insertAtBack(int value) {
		if(isEmpty()) { // neu list chua dc khoi tao thi nut dau = nut cuoi
			first = last = new Node(value);
		} else {
			last = new Node(value, null);
		}
	}
}
