package unit2.bai_tap_ve_nha;

public class SX1__ {
	public static void main(String[] args) {
		int A[] = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
		for(int i = A.length - 1; i > 0; i--) {
			int max = A[i], vt_max = i;
			for(int j = i - 1; j >= 0; j--) {
				if(A[j] > max) {
					max = A[j];
					vt_max = j;
				}
			}
			A[vt_max] = A[i];
			A[i] = max;
		}
		for (int number : A) {
			System.out.print(number + " ");
		}
	}
}
