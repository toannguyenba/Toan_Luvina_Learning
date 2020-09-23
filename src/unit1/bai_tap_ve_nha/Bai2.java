package unit1.bai_tap_ve_nha;

public class Bai2 {

//	2. Cho mảng  int [] A ={.....}; // Vòng while 
//	 2.1. Xác định đoạn dài nhất chứa các phần tử liên tiếp tạo thành một dãy tăng dần, in ra màn hình vị trí đầu, vị trí cuối của đoạn đó
//	 2.2. Xác định tất cả các đoạn dài nhất chứa các phần tử liên tiếp tạo thành một dãy tăng dần, in ra màn hình các đoạn đó theo các trương hợp sau:
//	- Trường hợp 1: Chỉ có một đoạn thì in ra: Độ dài của đoạn =...; [đầu:..., cuối=...]
//	- Trường hợp 2: Có nhiều hơn một đoạn thì in ra: Số đoạn:=....; Độ dài của đoạn =...; {[đầu:..., cuối=...]; [đầu:..., cuối=...]; ....[đầu:..., cuối=...]}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 3, 2, 3, 6, 4, 5, 6, 9, 10, 4, 3, 6, 7, 8, 9 };
		bai2_2(A);
	}

	public static void bai2_1(int[] A) {
		int i = 0;
		int max_length = 1;
		int i_start = 0;
		while (max_length + i <= A.length) {
			int length = 1, j = i;
			while (j < A.length - 1 && A[j + 1] > A[j]) {
				length++;
				j++;
			}
			if (length > max_length) {
				max_length = length;
				i_start = i;
			}
			i++;
		}
		System.out.println("vi tri dau: " + (i_start + 1));
		System.out.println("vi tri cuoi: " + (i_start + max_length));
	}

	public static void bai2_2(int[] A) {
		int i = 0, x = 0; // x la so doan con tang dan co chieu dai max
		int max_length = 1;
		int[] i_start = new int[A.length];
		while (max_length + i <= A.length) {
			int length = 1, j = i;
			while (j < A.length - 1 && A[j + 1] > A[j]) {
				length++;
				j++;
			}
			if (length > max_length) {
				max_length = length;
				i_start[0] = i;
				x = 1;
			} else if (length == max_length) {
				i_start[x] = i;
				x++;
			}
			i++;
		}
		// hien thi ket qua
		System.out.println("so doan = " + x);
		System.out.println("do dai doan = " + max_length);
		i = 0;
		while (i < x) {
			System.out.println("dau: " + (i_start[i] + 1) + " cuoi " + (i_start[i] + max_length));
			i++;
		}
	}

}
