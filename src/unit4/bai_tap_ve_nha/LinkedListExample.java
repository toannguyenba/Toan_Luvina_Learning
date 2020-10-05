package unit4.bai_tap_ve_nha;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList();
		list.add(new Student(1, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.add(new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.addFirst(new Student(4, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		list.addLast(new Student(5, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
		System.out.println(list.contains(new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi")));
		
		list.remove(new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"));
		
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
		list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getStuId() - s2.getStuId();
			}
		});
		
		for (Student student : list) {
			System.out.println(student.toString());
		}
	}
}
