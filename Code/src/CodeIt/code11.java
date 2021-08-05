package CodeIt;

import java.io.*;
import java.util.*;

class code11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, i, j, k, l, d, l1, p, q, c, n1, n2;
		double be, h, x, e, e1, e2;
		t = sc.nextInt();
		for (i = 0; i < t; i++) {
			c = 0;
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			int a[] = new int[n1];
			int b[] = new int[n2];
			for (j = 0; j < n1; j++)
				a[j] = sc.nextInt();
			for (k = 0; k < n2; k++)
				b[k] = sc.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			for (l = 0; l < n1; l++) {
				d = l;
				p = a[l];
				e1 = Math.pow(p, 2);
				while ((++d) < n1) {
					q = a[d];
					be = Math.pow((p - q), 2);
					e2 = Math.pow(q, 2);
					for (l1 = 0; l1 < n2; l1++) {
						e = Math.pow(b[l1], 2);
						h = e + e1;
						x = e + e2;
						if ((be > h) && (be > x) && (be == (h + x)))
							c++;
						else if ((h > be) && (h > x) && (h == (be + x)))
							c++;
						else if ((x > be) && (x > h) && (x == (be + h)))
							c++;
					}
				}
			}
			for (l = 0; l < n2; l++) {
				d = l;
				p = b[l];
				e1 = Math.pow(p, 2);
				while ((++d) < n2) {
					q = b[d];
					be = Math.pow((p - q), 2);
					e2 = Math.pow(q, 2);
					for (l1 = 0; l1 < n1; l1++) {
						e = Math.pow(a[l1], 2);
						h = e + e1;
						x = e + e2;
						if ((be > h) && (be > x) && (be == (h + x)))
							c++;
						else if ((h > be) && (h > x) && (h == (be + x)))
							c++;
						else if ((x > be) && (x > h) && (x == (be + h)))
							c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}