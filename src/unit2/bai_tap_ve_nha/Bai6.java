package unit2.bai_tap_ve_nha;

public class Bai6 {
	// 6. Sắp xếp các số dương tăng dần, các số âm giảm dần.
	public static void main(String[] args) {
		int A[] = { -11, 17, -3, 9, -10, 12, 6, 18, 4, 20, 7, -100 };

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > 0) {
				int min = A[i];
				int vt_min = i;
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] > 0 && A[j] < min) {
						min = A[j];
						vt_min = j;
					}
				}
				A[vt_min] = A[i];
				A[i] = min;
			}
			if (A[i] < 0) {
				int max = A[i];
				int vt_max = i;
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] < 0 && A[j] > max) {
						max = A[j];
						vt_max = j;
					}
				}
				A[vt_max] = A[i];
				A[i] = max;
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
