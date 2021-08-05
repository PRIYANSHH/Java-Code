package Coursera;

import java.util.*;

public class FiboHugeMod {

	private static long pisano_period(long m) {
		long a = 0, b = 1, d = 0;
		long c = a + b;
		for (int i = 0; i < m * m; i++) {
			c = (a + b) % m;
			a = b;
			b = c;
			if (a == 0 && b == 1) {
				d = i + 1;
				break;
			}
		}
		return d;

	}

	private static long getFibonacciHugeNaive(long n, long m) {
		long r = n % pisano_period(m);

		long first = 0;
		long second = 1;
		long result = r;

		for (int i = 0; i < r - 1; i++) {
			result = (first + second) % m;
			first = second;
			second = result;
		}

		return result % m;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		System.out.println(getFibonacciHugeNaive(n, m));
	}
}
