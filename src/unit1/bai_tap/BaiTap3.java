/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1.bai_tap;

/**
 *
 * @author LA-AM
 */
public class BaiTap3 {

    /*
        3. Cho mảng int [] A={10, -43, 13,-65}; Hãy xác định xem các ptu của mảng A có tạo thành dãy đan dấu hay không?
            (Kiểm tra 2 phần tử liên tiếp: A[i]*A[i-1]<0)
     */
    public static void main(String[] args) {
        int[] A = {10, -43, 13, -65};
        boolean ck = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] * A[i + 1] > 0) {
                ck = false;
                break;
            }
        }
        if (ck == true) {
            System.out.println("la day dan dau");
        } else {
            System.out.println("khong la day dan dau");
        }
    }

}
