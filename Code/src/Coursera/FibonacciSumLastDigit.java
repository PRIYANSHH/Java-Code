package Coursera;

import java.util.*;

public class FibonacciSumLastDigit {

	private static long getFibonacciSumNaive(long n) {
		if (n <= 1)
			return n;
		int r = (int) (n % 60);
		if (r == 0)
			return 0;
		int prev = 0, curr = 1;
		for (int i = 2; i < r + 3; i++) {
			int f = (prev + curr) % 60;
			prev = curr;
			curr = f;
		}

		int s = curr - 1;
		return s % 10;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s = getFibonacciSumNaive(n);
		System.out.println(s);
	}
}