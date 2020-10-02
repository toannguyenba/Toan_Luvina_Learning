/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.bai_tren_lop;

/**
 *
 * @author LA-AM
 */
public class ExceptionExample {
    
    public static void main(String[] args) {
        System.out.println("Bat dau");
        
        try {
            System.out.println("Phan nam trong try");
            int i = 2/0;
        } catch (Exception e) {
            System.out.println("xu ly ngoai le");
         //   return;
        } finally {
            System.out.println("Trong finally");
        }
        System.out.println("Truoc khi ket thuc");
        return;
    }
}
