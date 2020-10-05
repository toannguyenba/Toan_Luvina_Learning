package unit4.bai_tap_ve_nha;

import java.util.Date;

public class Student implements Comparable<Student>{
	private int stuId;
	private String name;
	private String address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stuId, String name, String address) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.address = address;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.stuId + "," + this.getName() + "," + this.getAddress();
	}

	@Override
	public boolean equals(Object stu) {
		if (stu instanceof Student) {
			return this.toString().equals(((Student) stu).toString());
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		return this.stuId - o.stuId;
	}
	
	
}
