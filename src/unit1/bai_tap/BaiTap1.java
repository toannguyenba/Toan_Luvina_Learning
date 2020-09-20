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
public class BaiTap1 {

    //1. cho x = 131, kiem tra xem x co phai la so ngto hay khong?
    public static void main(String[] args) {
        int x = 131;
        for (int i = 2; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                System.out.println("x = " + x + " khong phai so nguyen to");
                return;
            }
        }
        System.out.println("x = " + x + " la so nguyen to");
    }

}
