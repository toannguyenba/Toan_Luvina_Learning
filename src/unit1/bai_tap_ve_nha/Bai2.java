package unit1.bai_tap_ve_nha;

public class Bai2 {

//	2. Cho mảng  int [] A ={.....}; // Vòng while 
//	 2.1. Xác định đoạn dài nhất chứa các phần tử liên tiếp tạo thành một dãy tăng dần, in ra màn hình vị trí đầu, vị trí cuối của đoạn đó
//	 2.2. Xác định tất cả các đoạn dài nhất chứa các phần tử liên tiếp tạo thành một dãy tăng dần, in ra màn hình các đoạn đó theo các trương hợp sau:
//	- Trường hợp 1: Chỉ có một đoạn thì in ra: Độ dài của đoạn =...; [đầu:..., cuối=...]
//	- Trường hợp 2: Có nhiều hơn một đoạn thì in ra: Số đoạn:=....; Độ dài của đoạn =...; {[đầu:..., cuối=...]; [đầu:..., cuối=...]; ....[đầu:..., cuối=...]}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 3, 2, 3, 6, 4, 5, 6, 9, 4, 3, 6, 7, 8, 9 };
		bai2_2(A);
	}

	public static void bai2_1(int[] A) { // sua lai
		int i = 0;
		int max_length = 1;
		int i_start = 0;
		int length = 1;
		while (i < A.length - 1) {
			if (A[i + 1] > A[i]) {
				length++;
			} else {
				if (length > max_length) {
					max_length = length;
					i_start = i - length + 1;
				}
				length = 1;
			}
			i++;
		}
		if (length > max_length) {
			max_length = length;
			i_start = i - length + 1;
		}
		System.out.println("vi tri dau: " + (i_start));
		System.out.println("vi tri cuoi: " + (i_start + max_length - 1));
	}

	public static void bai2_2(int[] A) { // sua lai
		int[] i_start = new int[A.length];
		int max_length = 1;
		i_start[0] = 0;
		int soluong = 1;
		int length = 1;
		int i = 0;
		while (i < A.length - 1) {
			if (A[i + 1] > A[i]) {
				length++;
			} else {
				if (length > max_length) {
					max_length = length;
					soluong = 1;
					i_start[0] = i - length + 1;
				} else if (length == max_length) {
					i_start[soluong] = i - length + 1;
					soluong++;
				}
				length = 1;
			}
			i++;
		}
		if (length > max_length) {
			max_length = length;
			i_start[0] = i - length + 1;
		} else if (length == max_length) {
			i_start[soluong] = i - length + 1;
			soluong++;
		}
		if (soluong > 1) {
			System.out.print("Số đoạn:=" + soluong + "; Độ dài đoạn = " + max_length + "; ");
			i = 0;
			System.out.print("{");
			while(i < soluong) {
				System.out.print("[đầu:" + i_start[i] + ", cuối=" + (i_start[i] + max_length -1) + "];");
				i++;
			}
			System.out.println("}");
		} else {
			System.out.print("Độ dài đoạn = " + max_length + "; ");
			System.out.println("[đầu: " + i_start[0] + ", cuối: " + (i_start[0] + max_length - 1) + "]");
		}
	}

}
