package unit2.bai_tap_ve_nha;

public class SX2__ {
	public static void main(String[] args) {
		int[] A = { 17, 21, 9, 12, 6, 18, 4, 20, 7, 14 };
		for (int i = A.length - 2; i >= 0; i--) {
			int temp = A[i];
			for (int j = i + 1; j < A.length; j++) {
				if (temp > A[j])
					A[j - 1] = A[j];
				else {
					A[j - 1] = temp;
					break;
				}
				if (j == A.length - 1)
					A[j] = temp;
			}
		}
		for (int number : A) {
			System.out.print(number + " ");
		}
	}
}
