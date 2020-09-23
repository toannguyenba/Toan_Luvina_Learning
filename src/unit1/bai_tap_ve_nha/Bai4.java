/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1.bai_tap_ve_nha;

/**
 *
 * @author LA-AM
 */
public class Bai4 {
//    4. Cho một giá trị int x và một mảng int [] A ={.....}; gồm các phần tử tạo thành 1 dãy tăng dần;
//Thực hiện tìm kiếm nhị phân phần tử x trong mảng A.

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 7, 8, 11, 13, 17, 19, 20, 21 };
		int x = 17;
		int l_flag = 0, r_flag = A.length - 1, mid = 0;
		boolean ck = false;
		while (l_flag != r_flag) {
			mid = (l_flag + r_flag) / 2;
			if (A[mid] == x) {
				ck = true;
				break;
			} else if (x < A[mid]) {
				r_flag = mid - 1;
			} else { // x > A[vt]
				l_flag = mid + 1;
			}
		}
		if (ck) {
			System.out.println("Vi tri cua x = " + x + " trong mang la: " + mid);
		} else {
			if (A[l_flag] == x) {
				System.out.println("Vi tri cua x = " + x + " trong mang la: " + l_flag);
			} else {
				System.out.println("x = " + x + " khong co trong mang");
			}
		}
	}
}
