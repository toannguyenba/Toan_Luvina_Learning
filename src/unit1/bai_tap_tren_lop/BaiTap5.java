/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1.bai_tap_tren_lop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LA-AM
 */
public class BaiTap5 {

    /*
    2. Cho mảng int [] A={10, -43, 13,-65}; tìm giá trị LN (NN) trong mảng và in ra các vị trí xuất hiện của nó.
        (Dùng thêm một mảng nữa để lưu các vị trí xuất hiện)
     */
    public static void main(String[] args) {
        int[] A = {10, -43, 13, -65};
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
        List vt = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == max) {
                vt.add(i);
                System.out.println(i + "    ");
            }
        }
    }
}
