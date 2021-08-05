package CodeIt;

import java.util.*;

class choco {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, w, i, j, n, max, c, k, l = 0, p = 0;
		t = sc.nextInt();
		while (t-- > 0) {
			c = 0;
			j = 0;
			w = 0;
			p = 0;
			n = sc.nextInt();
			k = n / 2;
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			max = a[0];
			for (i = 0; i < n; i++) {
				if (max < a[i])
					max = a[i];
			}
			for (i = n - 1; i >= 0; i--) {
				j++;
				if (a[i] < max) {
					c++;
				} else {
					c = 0;
				}
				if ((c != 0) && (c >= k) && (c != n) && (c != (n - 1))) {
					p = 1;
					l = j;
				}
			}
			if (p == 1 && l != n && l != n - 1)
				System.out.println(l);
			else
				System.out.println("0");
		}
	}
}
