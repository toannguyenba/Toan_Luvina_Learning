package unit1.bai_tap_ve_nha;

import java.util.StringTokenizer;

public class Bai6 {
//	Xâu kí tự:
//		1. Cho một xâu kí tự chứa họ đệm tên, có thể thừa một số dấu cách. Viết chương trình loại bỏ các dấu cách thừa. Ví dụ: "Nguyễn    Văn     A    "
//		2. Cho một xâu kí tự họ đệm tên. Viết chương trình tách riêng phần họ, đệm và tên.
//		3. Cho xâu kí tự. Viết chương trình tìm tất cả các từ dài nhất trong xâu (các từ cách nhau bởi dấu cách).
//		4. Cho một mảng chứa N phần tử là họ đệm tên của sinh viên. Viết chương trình đếm xem có bao nhiêu sinh viên tên Bình.
//		5. Cho một mảng chứa N phần tử là họ đệm tên của sinh viên. Hãy viết chương trình sắp xếp lại mảng theo thứ tự bảng chữ cái (tên họ đệm).

	public static void main(String[] args) {
		Bai6 b6 = new Bai6();
		System.out.println((int) ' ');
		String[] s = { "Nguyen Y", "Nguyen Ba Nam", "Nguyen Van Nam", "Le Thi Yen", "Vu Thi Ngoan" };
		b6.sortName(s);
		for (String string : s) {
			System.out.println(string);
		}
	}

	// 6.1
	public String xoaDauCachThua(String s) {
		StringBuffer rs = new StringBuffer();
		StringTokenizer stknz = new StringTokenizer(s);
		while (stknz.hasMoreElements()) {
			rs.append(stknz.nextToken() + " ");
		}
		return rs.deleteCharAt(rs.length() - 1).toString();
	}

	// 6.2 rs[0] tra ve ho, rs[1] tra ve ten dem, rs[2] tra ve ten, neu ko dung cau
	// truc ho dem ten tra ve null
	public String[] tachHoDemTen(String hodemten) {
		StringTokenizer stknz = new StringTokenizer(hodemten);
		if (stknz.countTokens() < 3) { // ko dung cau truc ho dem ten
			return null;
		}
		String[] rs = new String[3];
		int i = 1;
		rs[0] = stknz.nextToken();
		rs[1] = "";
		while (stknz.hasMoreElements() && i < stknz.countTokens()) {
			rs[1] = rs[1] + stknz.nextToken() + " ";
		}
		rs[1] = rs[1].trim();
		rs[2] = stknz.nextToken();
		return rs;
	}

	// 6.3
	public String[] tuDaiNhatTrongCau(String s) {
		StringTokenizer stknz = new StringTokenizer(s);
		String[] mang = new String[stknz.countTokens()];
		int max_length = mang[0].length();
		// tim tu co do dai dai nhat
		int n = 1;
		for (String temp : mang) {
			if (temp.length() > max_length) {
				max_length = temp.length();
				n = 1;
			} else if (temp.length() == max_length) {
				n++;
			}
		}
		String[] rs = new String[n];
		int i = 0;
		for (String temp : mang) {
			if (temp.length() == max_length) {
				rs[i] = temp;
			}
		}
		return rs;
	}

	// 6.4
	public int findName(String[] listName, String findName) {
		int rs = 0;
		for (String s : listName) {
			if ((s.lastIndexOf(findName) + findName.length()) == s.length() && s.lastIndexOf(findName) > 0
					&& s.charAt(s.lastIndexOf(findName) - 1) == ' ') {// neu findName nam o cuoi cung ten, va truoc do
																		// la 1 dau cach
				rs++;
			}
		}
		return rs;
	}

	// 6.5
	public void sortName(String[] listName) {
		//doi thanh dinh danh ten-ho-dem
		for (int i = 0; i < listName.length; i++) {
			listName[i] = formatTenHoDem(listName[i]);
		}
		//sap xep
		for (int i = 0; i < listName.length - 1; i++) {
			for (int j = 0; j < listName.length - i - 1; j++) {
				if (compareString(listName[j], listName[j + 1]) > 0) {
					String temp = listName[j];
					listName[j] = listName[j + 1];
					listName[j + 1] = temp;
				}
			}
		}
		//doi lai ve ho dem ten
		for(int i = 0; i < listName.length; i++) {
			listName[i] = formatHoTenDem(listName[i]);
		}
	}

	public static int compareString(String s1, String s2) {
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) > s2.charAt(i))
				return 1;
			if (s1.charAt(i) < s2.charAt(i))
				return -1;
		}
		return s1.length() - s2.length();
	}

	public static String formatTenHoDem(String hotendem) {
		String rs = null;
		int i = hotendem.lastIndexOf(' ');
		rs = hotendem.substring(i + 1, hotendem.length()) + " " + hotendem.substring(0, i);
		return rs;
	}

	public static String formatHoTenDem(String tenhodem) {
		String rs = null;
		int i = tenhodem.indexOf(' ');
		rs = tenhodem.substring(i, tenhodem.length()) + " " + tenhodem.substring(0, i);
		return rs;
	}
}
