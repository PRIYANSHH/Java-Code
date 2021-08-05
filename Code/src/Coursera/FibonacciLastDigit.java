package Coursera;

import java.util.*;

public class FibonacciLastDigit {

	private static int getFibonacciLastDigitNaive(int n) {
		if (n <= 1)
			return n;
		int a[] = new int[60];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < 60; i++) {
			a[i] = (a[i - 1] + a[i - 2]) % 10;
		}
		int index = n % 60;
		return a[index];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = getFibonacciLastDigitNaive(n);
		System.out.println(c);
	}
}