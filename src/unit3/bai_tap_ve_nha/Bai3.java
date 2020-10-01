package unit3.bai_tap_ve_nha;

import java.io.FileReader;
import java.io.FileWriter;

public class Bai3 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		String in_path = "data\\Bai3-1.txt";
		String out_path = "data\\Bai3-2.txt";
		boolean hoa = false, cach = true;
		StringBuffer result = new StringBuffer();
		try {
			fr = new FileReader(in_path);
			fw = new FileWriter(out_path);
			int c;
			while ((c = fr.read()) != -1) {
				switch (c) {
				case '.': {
					fw.write(c);
					hoa = true;
					cach = true;
					continue;
				}
				case ',': {
					fw.write(c);
					fw.write(' ');
					cach = false;
					continue;
				}
				case ' ': {
					if (cach == true) {
						fw.write(c);
						cach = false;
					}
					continue;
				}
				default: {
					cach = true;
					if (hoa == true) {
						fw.write(c + 'A' - 'a');
						hoa = false;
					} else {
						fw.write(c);
					}
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
