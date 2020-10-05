package unit4.bai_tap_ve_nha;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	public static void main(String[] args) {
		Student[] arr = { new Student(1, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(4, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(5, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(6, "Nguyen Ba Toan", "Hoai Duc - Ha Noi") };
		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>();
		hmap.put(arr[0].getStuId(), arr[0]);
		hmap.put(arr[3].getStuId(), arr[3]);
		hmap.put(arr[2].getStuId(), arr[2]);
		hmap.put(arr[5].getStuId(), arr[5]);
		hmap.put(arr[1].getStuId(), arr[1]);
		hmap.put(arr[4].getStuId(), arr[4]);
		
		Iterator<Integer> iterator = hmap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("key la:" + key + "---" + hmap.get(key).toString());
		}

	}
}
