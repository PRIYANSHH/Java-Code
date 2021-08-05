package Coursera;

import java.util.*;

public class lcm {

	private static int gcd_naive(int a, int b) {
		if (a == 0)
			return b;
		return (gcd_naive(b % a, a));
	}

	private static long lcm_naive(int a, int b) {
		long c = (long) a * b;
		return (c / gcd_naive(a, b));
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm_naive(a, b));
	}
}