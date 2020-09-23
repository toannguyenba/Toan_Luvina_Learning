package unit1.bai_tap_ve_nha;

public class Bai5 {
	
//	5. Biến đổi mảng bằng cách thay giá trị max = giá trị min và ngược lại.
	public static void main(String[] args) {
		int[] A = {3,5,6,2,6,7,2,9,3};
		//tim max, min
		int min = A[0], max = A[0], i_min = 0, i_max = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
				i_min = i;
			}
			if (A[i] > max) {
				max = A[i];
				i_max = i;
			}
		}
		
		//doi vi tri min max
		int temp = A[i_min];
		A[i_min] = A[i_max];
		A[i_max] = temp;
		//Hien thi mang sau khi bien doi
		System.out.print("mang sau khi bien doi: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "	");
		}
	}
}
