package unit1.bai_tap_ve_nha;

public class Bai3 {

//	3. Cho một giá trị int x=7 và một mảng  int [] A ={ 4, 6, 9, 10, 17, 22}; gồm các phần tử tạo thành 1 dãy tăng dần                     
//	Hãy bỏ phần tử cuối cùng của mảng A và chèn x vào mảng A để dãy kết quả nhận được là một dãy tăng dần.
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] A = {4, 6, 9, 10, 17, 22}; // sua lai 1 chut
        int x = 7;
        A[A.length - 1] = x;
        int i;
        for (i = A.length - 1; i > 0; i--) {
            if (x > A[i-1]) {
                break;
            } else {
                A[i] = A[i-1];
            }
        }
        A[i] = x;
        for(i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
