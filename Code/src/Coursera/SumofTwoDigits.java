package Coursera;

import java.util.Scanner;

public class SumofTwoDigits {
	static int sumOfTwoDigits(int first_digit, int second_digit) {
		return first_digit + second_digit;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(sumOfTwoDigits(a, b));
	}
}