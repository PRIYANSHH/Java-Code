package CodeIt;

import java.util.*;

class covid {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, i, c, v, q, j, k, l;
		t = sc.nextInt();
		while (t-- > 0) {
			c = 0;
			q = 0;
			j = 0;
			k = 0;
			l = 0;
			n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if (a[i] == 1) {
					b[c] = i;
					c++;
					l++;
				} else if (a[i] == 0)
					j++;
				else {
					k = 1;
					break;
				}
			}
			for (i = c - 1; i > 0; i--) {
				v = b[i] - b[i - 1];
				q = 0;
				if (v >= 6 || l == 1)
					q = 1;
				else
					break;

			}
			if (q == 1 && j < n && k == 0)
				System.out.println("YES");
			else if (q == 0 || j == n || k == 1)
				System.out.println("NO");

		}
	}
}