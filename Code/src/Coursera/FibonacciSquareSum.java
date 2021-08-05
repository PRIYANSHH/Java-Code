package Coursera;

import java.util.*;

public class FibonacciSquareSum {
	private static long getFibonacciSumSquaresNaive(long n) {
		if (n <= 1)
			return n;
		int a[] = new int[60];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < 60; i++) {
			a[i] = (a[i - 1] + a[i - 2]) % 10;
		}
		int index = (int) (n % 60);
		return a[index];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s1 = getFibonacciSumSquaresNaive(n);
		long s2 = getFibonacciSumSquaresNaive(n + 1);
		System.out.println((s1 * s2) % 10);
	}
}
