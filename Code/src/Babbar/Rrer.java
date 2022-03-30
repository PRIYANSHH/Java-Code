package Babbar;

import java.util.*;

public class Rrer {
	{
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}

	Rrer() {
		System.out.println(3);
	}

	{
		System.out.println(4);
	}
	{
		System.out.println(5);
	}

	static void display() {
		System.out.println(6);
	}

	public static void main(String args[]) {
		for (int i = 0; i < 10; i = i + 5) {
			i = i - 1;
			System.out.println(i);
		}
	}
}

class St {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}