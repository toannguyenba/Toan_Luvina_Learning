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
public class BaiTap4 {

    /*
    1. Cho mảng int [] A={10, -43, 13,-65}; tìm giá trị LN hoặc NN trong mảng.
     */

    public static void main(String[] args) {
        int[] A = {10, -43, 13, -65};
        int max = A[0], min = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println("so lon nhat la " + max);
        System.out.println("so lon nhat la " + min);
    }
}
