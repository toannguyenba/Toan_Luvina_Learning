package unit3.bai_tap_ve_nha;

import java.io.File;
import java.io.RandomAccessFile;

public class Bai2_1 {
	public static void main(String[] args) {
		int [] A= {6, 7, 9, 14};
		String path = "data\\Bai2.txt";
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(path, "rw");
			for (int i = 0; i < A.length; i++) {
				raf.writeInt(A[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
