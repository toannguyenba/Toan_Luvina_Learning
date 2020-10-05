package unit4.bai_tap_ve_nha;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Student[] arr = { new Student(1, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(2, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(3, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(4, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(5, "Nguyen Ba Toan", "Hoai Duc - Ha Noi"),
				new Student(6, "Nguyen Ba Toan", "Hoai Duc - Ha Noi") };
		PriorityQueue<Student> pQueue = new PriorityQueue<Student>();
		pQueue.add(arr[3]);
		pQueue.add(arr[2]);
		pQueue.add(arr[5]);
		pQueue.add(arr[1]);
		pQueue.add(arr[0]);
		pQueue.add(arr[4]);
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
	}
}
