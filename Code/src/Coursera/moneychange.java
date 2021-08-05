package Coursera;

import java.util.Scanner;

public class moneychange {
	private static int getChange(int m) {
		int r = 0;
		while (m != 0) {
			if (m >= 10) {
				r += m / 10;
				m = m % 10;
			} else if (m >= 5 && m < 10) {
				r++;
				m = m % 5;
			} else {
				r += m / 1;
				m = m % 1;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
