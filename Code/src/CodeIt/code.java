package CodeIt;

import java.util.*;

class code {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, j, t, n;
		long k, sum, p;

		t = sc.nextInt();
		for (i = 0; i < t; i++) {
			sum = 0;
			n = sc.nextInt();
			k = sc.nextLong();
			long a[] = new long[n];
			for (j = 0; j < n; j++) {
				a[j] = sc.nextLong();
				sum += a[j];
			}
			p = sum % k;
			System.out.println(p);
		}
	}
}