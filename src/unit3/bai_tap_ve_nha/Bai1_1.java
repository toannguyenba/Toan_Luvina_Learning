package unit3.bai_tap_ve_nha;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai1_1 {
	public static void main(String[] args) {
		int[] A = { 11, 6, 7, 8, 9, 10 };
		String path = "data\\Bai1-1.txt";
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(path);
			dos = new DataOutputStream(fos);
			// ghi vao file
			for (int i = 0; i < A.length; i++) {
				dos.writeInt(A[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
