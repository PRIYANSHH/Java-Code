package Babbar;

import java.util.*;

public class missingNumber {
	public static int sumSolve(int a[]) {
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			num += i + 1;
			num -= a[i];
		}
		num += a.length + 1;
		return num;
	}

	public static int xorSolve(int a[]) {
		int x = 0, y = 0, i;
		for (i = 0; i < a.length; i++) {
			x = x ^ a[i];
			y = y ^ (i + 1);
		}
		y = y ^ (i + 1);
		return x ^ y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int sol1 = sumSolve(a);
			int sol2 = xorSolve(a);
			System.out.println(sol1 + " " + sol2);
		}
	}
}