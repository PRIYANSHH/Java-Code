package CodeIt;

import java.util.*;

class fruits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, m, min, max, i, j, k, p, h, g, flag;
		t = sc.nextInt();
		while (t-- > 0) {
			max = 0;
			h = 0;
			g = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (j = 0; j < n; j++)
				a[j] = sc.nextInt();
			for (j = 0; j < n; j++)
				b[j] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if (max <= a[i])
					max = a[i];
			}
			int c[] = new int[max];
			for (k = 0; k < max; k++)
				c[k] = 0;
			i = 1;
			while (i <= max) {
				p = 0;
				flag = 0;
				for (j = 0; j < n; j++) {
					if (i == a[j]) {
						flag++;
						p += b[j];
						c[h] = p;
					}
				}
				if (flag == 0)
					h = h;
				else
					h++;
				i++;
			}
			g = h;
			min = c[0];
			for (k = 0; k < g; k++) {
				if (c[k] < min)
					min = c[k];
			}
			System.out.println(min);
		}
	}
}