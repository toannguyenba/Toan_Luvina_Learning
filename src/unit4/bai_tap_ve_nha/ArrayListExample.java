package unit4.bai_tap_ve_nha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(1, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(4, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(6, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(2, new Student(5, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
		list.remove(new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		System.out.println("--------------------------------");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
		Collections.sort(list);
		System.out.println("--------------------------------");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
	}
}
