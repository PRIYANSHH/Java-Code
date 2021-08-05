package CodeIt;

import java.util.*;

class laser {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, x1, x2, i, j, k, s, n, q, c, y, f, h;
		float x;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			q = sc.nextInt();
			int a[] = new int[n];
			float b[] = new float[1000];
			for (k = 0; k < n; k++)
				a[k] = sc.nextInt();
			h = 0;
			for (j = 0; j < q; j++) {
				x1 = sc.nextInt();
				x2 = sc.nextInt();
				y = sc.nextInt();
				for (i = 0; i < n - 1; i++) {
					s = a[i + 1] - a[i];
					x = (float) (y - a[i] + (s * (i + 1))) / s;
					if (s >= 0) {
						if ((x >= x1 && x <= x2) && (y >= a[i] && y <= a[i + 1])) {
							b[h] = x;
							System.out.println(b[h]);
							h++;
						}
					} else {
						if ((x >= x1 && x <= x2) && (y <= a[i] && y >= a[i + 1])) {
							b[h] = x;
							System.out.println(b[h]);
							h++;
						}
					}
				}
			}
		}
	}
}