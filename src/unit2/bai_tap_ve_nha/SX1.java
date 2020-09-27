package unit2.bai_tap_ve_nha;

public class SX1 {
	public static void main(String[] args) {
		int A[] = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
		for(int i = 0; i < A.length - 1; i++) {
			int min = A[i], vt_min = i;
			for(int j = i + 1; j < A.length; j++) {
				if(A[j] < min) {
					min = A[j];
					vt_min = j;
				}
			}
			A[vt_min] = A[i];
			A[i] = min;
		}
		for (int number : A) {
			System.out.print(number + " ");
		}
	}
}
