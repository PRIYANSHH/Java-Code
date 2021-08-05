package CodeIt;

import java.util.*;

class No_change {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, p, t, i, j, k, s = 0, l, c, w, be = 0;
		t = sc.nextInt();
		for (i = 0; i < t; i++) {
			w = 0;
			n = sc.nextInt();
			p = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			for (k = n - 1; k >= 0; k--) {
				c = 0;
				while ((((w + a[k]) < p)) || ((w + a[k]) == (p + 1))) {
					w += a[k];
					c++;
					b[k] = c;
				}
				s = w;
				be = w + a[k];
			}
			if (s == p || be == p)
				System.out.println("NO");
			else if (s == (p + 1)) {
				System.out.print("YES ");
				for (l = 0; l < n; l++)
					System.out.print(b[l] + " ");
				System.out.println();
			}
		}
	}
}