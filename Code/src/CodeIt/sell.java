package CodeIt;

import java.util.*;

class sell {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, i, j;
		long s, p;
		t = sc.nextInt();
		while (t-- > 0) {
			s = 0;
			p = 0;
			n = sc.nextInt();
			Long a[] = new Long[n];
			for (j = 0; j < n; j++)
				a[j] = sc.nextLong();
			Arrays.sort(a, Collections.reverseOrder());
			for (i = 0; i < n; i++) {
				a[i] = a[i] - i;
				if (a[i] > 0) {
					s += a[i];
				}
			}
			p = s % 1000000007;
			System.out.println(p);
		}
	}
}