package Babbar;

import java.util.*;

public class fibonacci {
	private static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int i;
			double five = Math.sqrt(5);
			int a[] = new int[n + 1];
			int b[] = new int[n + 1];
			for (i = 0; i <= n; i++) {
				a[i] = fib(i);
				b[i] = (int) Math.round(((Math.pow(((five + 1) / 2), i)) / five));
			}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.out.println(fib(sum + 2) - 1);
		}
	}
}