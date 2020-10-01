package unit3.bai_tap_ve_nha;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai1_2 {
	public static void main(String[] args) {
		// doc file
		String in_path = "data\\Bai1-1.txt";
		String out_path = "data\\\\Bai1-2.txt";
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		int A[] = null;
		try {
			fis = new FileInputStream(in_path);
			dis = new DataInputStream(fis);
			int length = (int) dis.available() / 4;
			A = new int[length]; // mang A de ghi gia tri doc tu file
			for (int i = 0; i < length; i++) {
				A[i] = dis.readInt();
			}
			// sap xep lai mang
			for (int i = 0; i < length - 1; i++) {
				int min = A[i];
				int vt_min = i;
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] < min) {
						min = A[j];
						vt_min = j;
					}
				}
				A[vt_min] = A[i];
				A[i] = min;
			}
			// Ghi lai vao file
			fos = new FileOutputStream(out_path);
			dos = new DataOutputStream(fos);
			for (int i = 0; i < A.length; i++) {
				dos.writeInt(A[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				dis.close();
				fos.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
