package unit2.bai_tap_ve_nha;

public class SX2__ {

    public static void main(String[] args) {
        int[] A = {17, 21, 9, 12, 6, 18, 4, 20, 7, 14};
        for (int i = A.length - 2; i >= 0; i--) {
            int temp = A[i];
            for (int j = i; j < A.length - 1; j++) {
                if (temp > A[j + 1]) {
                    A[j] = A[j + 1];
                } else {
                    break;
                }
                A[j + 1] = temp;
            }
        }
        for (int number : A) {
            System.out.print(number + " ");
        }
    }
}
