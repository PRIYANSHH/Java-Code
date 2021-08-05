package Coursera;

import java.util.*;

public class FibonacciPartialSum {

	private static int getFibonacciPartialSumNaive(long n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else {
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
			System.out.println(s);
			return s;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long from = scanner.nextLong();
		long to = scanner.nextLong();
		int f = (int) Math.abs(getFibonacciPartialSumNaive(to + 2) - getFibonacciPartialSumNaive(from + 1));
		System.out.println(f % 10);
	}
}