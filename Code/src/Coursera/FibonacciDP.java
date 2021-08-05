package Coursera;

import java.util.Scanner;

public class FibonacciDP {
	private static long calc_fib(int n) {
		if (n <= 1)
			return n;
		long a[] = new long[n + 1];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i <= n; i++)
			a[i] = a[i - 1] + a[i - 2];

		return a[n];
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(calc_fib(n));
	}
}