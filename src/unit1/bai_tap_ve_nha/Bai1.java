package unit1.bai_tap_ve_nha;

public class Bai1 {
	/*
	 * 1. Mảng int [] A ={.....}; // Vòng while Tìm, in ra giá trị LN và tất cả các
	 * ví trị xuất hiện của nó theo các trường hợp sau Trường hợp 1: chí có 1 giá
	 * trị là LN thì in ra: Max=... Trường hợp 2: có nhiều 1 hơn 1 phần tử của mảng
	 * có giá trị bằng LN thì in ra như sau: Max=...; Soluong=...; cac vi tri= vt1,
	 * vt2, ....vtcuoi. (Dùng mảng khác để lưu vị trí)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,3,8,2,6,7,6,8,8,3};
		int[] vt = new int[A.length];
		
		//Tim max
		int max = A[0];
		int i = 1;
		while (i < A.length) {
			if (A[i] > max) {
				max = A[i];
			}
			i++;
		}
		
		//Tim vi tri va so luong = max
		i = 0;
		int x = 0, soluong = 0;
		while (i < A.length) {
			if (A[i] == max) {
				soluong++;
				vt[x] = i;
				x++;
			}
			i++;
		}
		
		//hien thi ket qua
		i = 0;
		if (soluong > 1) {
			System.out.println("Max = " + max);
			System.out.println("So luong = " + soluong);
			System.out.print("Cac vi tri: ");
			while(i < soluong) {
				System.out.print(vt[i] + "	");
				i++;
			}
		} else {
			System.out.println("Max = " + max);
		}
	}

}
