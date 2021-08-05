package Coursera;

import java.util.*;

public class CarFueling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int d = sc.nextInt();
			int i, k = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int sum = 0;
			for (i = 0; i < n; i++) {
				if (a[i] < d) {
					k += a[i];
					sum -= d;
					continue;
				} else if (a[i] == d) {
					sum += a[i];
					k = 0;
				} else if (a[i] > d && i != 0) {
					sum += a[i - 1];
					k = 0;
				}
			}
			if (k <= d)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
