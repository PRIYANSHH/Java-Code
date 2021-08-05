package CodeIt;

import java.util.*;

class leper {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, i, j, k, n, c, d;
		t = sc.nextInt();
		while (t-- > 0) {
			c = 0;
			d = 0;
			n = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				for (j = i; j < n; j++) {
					if (a[i] > a[j])
						c++;
				}
			}
			for (k = 0; k < n - 1; k++) {
				if (a[k] > a[k + 1])
					d++;
			}
			if (c == d)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}