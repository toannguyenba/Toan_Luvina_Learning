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
public class BaiTap6 {

    /*
         3. Cho mảng int [] A={10,12, 14, -43, 13,-65} tìm dãy con tăng dần dài nhất trong A và in ra dãy đó.
     */
    public static void main(String[] args) {
        int[] A = {10, 12, 14, -43, 13, -65};
        int i_start = 0, max_length = 1;
        for (int i = 0; i < A.length; i++) {
            int length = 1;
            for (int j = i; j < A.length - 1; j++) {
                if (A[j + 1] > A[j]) {
                    length++;
                } else {
                    break;
                }
            }
            if (length > max_length) {
                max_length = length;
                i_start = i;
            }
        }
        System.out.print("dai con tang dan dai nhat la: ");
        for (int i = i_start; i < i_start + max_length; i++) {
            System.out.print(A[i] + "   ");
        }
    }
}
