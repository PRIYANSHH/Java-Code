package Babbar;

import java.util.*;

public class Studenttts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student[] = new Student[4];
		for (int i = 0; i < 4; i++) {
			int rollNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double score = sc.nextDouble();
			boolean dayScholar = sc.nextBoolean();
			student[i] = new Student(rollNo, name, branch, score, dayScholar);
		}
		int count = findCountOfDayscholarStudents(student);
		if (count == 0)
			System.out.println("There are no such dayscholar students");
		else
			System.out.println(count);
		Student stu = findStudentwithSecondHighestScore(student);
		if (stu == null)
			System.out.println("There are no student from non day scholar");
		else
			System.out.println(stu.getRollNo() + "#" + stu.getName() + "#" + stu.getScore());
	}

	public static int findCountOfDayscholarStudents(Student students[]) {
		int count = 0;
		for (Student student : students) {
			if (student.getScore() > 80 && student.getDayScholar() == true)
				count++;
		}
		return count;
	}

	public static Student findStudentwithSecondHighestScore(Student students[]) {
		double max1 = -1.0;
		Student str = null;
		for (Student student : students) {
			if (student.getScore() > max1 && student.getDayScholar() == false)
				max1 = student.getScore();
		}
		double max2 = -1.0;
		for (Student student : students) {
			if (student.getScore() > max2 && student.getScore() < max1 && student.getDayScholar() == false) {
				max2 = student.getScore();
				str = student;
			}
		}
		return str;
	}
}

class Student {
	private int rollNo;
	private String name;
	private String branch;
	private double score;
	private boolean dayScholar;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public boolean getDayScholar() {
		return dayScholar;
	}

	public void setDayScholar(boolean dayScholar) {
		this.dayScholar = dayScholar;
	}

	public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.score = score;
		this.dayScholar = dayScholar;
	}
}
