package unit2.bai_tap_ve_nha;

public class SX2 {
	public static void main(String[] args) {
		int A[] = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
		for(int i = 1; i < A.length; i++) {
			int temp = A[i];
			int j;
			for (j = i; j > 0; j--) {
				if (temp >= A[j-1]) {
					break;
				} else {
					A[j] = A[j - 1];
				}
			}
			A[j] = temp;
		}
		for (int number : A) {
			System.out.print(number + " ");
		}
	}
}
