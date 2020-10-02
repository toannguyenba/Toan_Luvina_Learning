package unit3.bai_tap_ve_nha;

import java.io.RandomAccessFile;

public class Bai2_2 {
    //sua lai truong hop, dich den phan tu 0
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        String path = "data\\Bai2.txt";
        int step = 4;
        int x = 5;
        int temp = 0;
        try {
            raf = new RandomAccessFile(path, "rw");
            int count = (int) raf.length() / 4;
            for (int i = count - 1; i >= 0; i--) {
                raf.seek(i * step);
                temp = raf.readInt();
                if (x > temp) {
                    break;
                } else {
                    raf.writeInt(temp);
                }
            }
            raf.writeInt(x);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
