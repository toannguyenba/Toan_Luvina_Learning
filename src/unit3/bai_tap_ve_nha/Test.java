package unit3.bai_tap_ve_nha;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class Test {
	public static void main(String[] args) {
		
//		String in_path = "data\\\\\\\\Bai1-2.txt";
//		FileInputStream fis = null;
//		DataInputStream dis = null;
//		try {
//			fis = new FileInputStream(in_path);
//			dis = new DataInputStream(fis);
//			int count = dis.available()/4;
//			while(count-->0) {
//				System.out.println(dis.readInt());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				dis.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//			
//		}
		
		RandomAccessFile raf = null;
		String path = "data\\Bai2.txt";
		try {
			raf = new RandomAccessFile(path, "rw");
			int count = (int)raf.length()/4;
			for (int i = 0; i < count; i++) {
				System.out.println(raf.readInt());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
