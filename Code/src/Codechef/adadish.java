package Codechef;

import java.util.*;

public class adadish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			if (n <= 2) {
				System.out.println(a[n - 1]);
			} else if (n == 3) {
				System.out.println(Math.max(a[n - 1], a[n - 2] + a[n - 3]));
			} else {
				b[0] = Math.max(a[n - 2] + a[n - 3] + a[n - 4], a[n - 1]);
				b[1] = Math.max(a[n - 1] + a[n - 3] + a[n - 4], a[n - 2]);
				b[2] = Math.max(a[n - 4] + a[n - 2], a[n - 1] + a[n - 3]);
				b[3] = Math.max(a[n - 3] + a[n - 2], a[n - 1] + a[n - 4]);
				Arrays.sort(b);
				System.out.println(b[0]);
			}
		}
	}
}