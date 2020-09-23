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
public class BaiTap7 {

    /* 
        4. Cho mảng int [] A={10,12, 14, -43, 13,-65} tìm dãy các con tăng dần dài nhất trong A và in ra các dãy đó.
     */
    public static void main(String[] args) {
        int[] A = {10, 12, 14, -43, 13, -65, 1, 2};
        int max_length = 1;
        List<Integer> i_start = new ArrayList<Integer>();
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
            }
        }
        for (int i = 0; i < A.length; i++) {
            int length = 1;
            for (int j = i; j < A.length - 1; j++) {
                if (A[j + 1] > A[j]) {
                    length++;
                } else {
                    break;
                }
            }
            if (length == max_length) {
                i_start.add(i);
            }
        }
        System.out.println("Do dai day tang dan dai nhat: " + max_length);
        System.out.println("Cac day: ");
        for (int temp : i_start) {
            for (int i = temp; i < temp + max_length; i++) {
                System.out.print(A[i] + "   ");
            }
            System.out.println("");
        }
    }
}
