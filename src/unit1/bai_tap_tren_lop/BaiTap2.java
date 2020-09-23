/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1.bai_tap_tren_lop;

/**
 *
 * @author LA-AM
 */
public class BaiTap2 {

    /*
    2. Cho mảng int [] A={10, 43, 13,65}; Hãy xác định xem các ptu của mảng A có tạo thành dãy tăng dần hay không?
  (Kiểm tra 2 phần tử liên tiếp: A[i]>A[i-1])
     */
    public static void main(String[] args) {
        int[] A = {10, 43, 13, 65};
        boolean ck = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i+1] <= A[i]) {
                ck = false;
                break;
            }
        }
        if (ck == true) {
            System.out.println("la day tang dan");
        }
        else {
            System.out.println("khong la chuoi tang dan");
        }
    }

}
