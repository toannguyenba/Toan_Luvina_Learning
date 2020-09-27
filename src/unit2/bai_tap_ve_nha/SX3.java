package unit2.bai_tap_ve_nha;

public class SX3 {
	public static void main(String[] args) {

		int[] A = { 17, 21, 9, 12, 6, 18, 4, 20, 7, 14 };
		for (int i = A.length - 1; i > 0; i--) {
			for (int j = A.length - 1; j > A.length - i - 1; j--) {
				if (A[j] < A[j-1]) {
					int temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
				}
			}
		}
		for (int number : A) {
			System.out.print(number + " ");
		}
	}
}
