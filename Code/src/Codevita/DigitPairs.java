package Codevita;

import java.util.*;

public class DigitPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int d[] = new int[n];
		int i, p, q, r;
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < n; i++) {
			int l = 0;
			int s = 9;
			p = a[i];
			while (p != 0) {
				r = p % 10;
				l = Math.max(r, l);
				s = Math.min(r, s);
				p /= 10;
			}
			q = (l * 11) + (s * 7);
			b[i] = q % 100;
		}
		for (i = 0; i < n; i++) {
			p = b[i];
			while (p >= 10) {
				p /= 10;
			}
			d[i] = p;
		}
		int j = i;
		int ind = 0;
		int e[] = new int[10];
		int o[] = new int[10];
		for (i = 0; i < j; i++) {
			ind = d[i];
			if (((i + 1) & 1) == 0)
				e[ind] += 1;
			else
				o[ind] += 1;
		}
		int l, c = 0;
		p = 0;
		q = 0;
		for (i = 0; i < 10; i++) {
			if (e[i] <= 1 && o[i] <= 1)
				continue;
			else {
				if (e[i] == 2)
					p = 1;
				else if (e[i] > 2)
					p = 2;
				else
					p = 0;
				if (o[i] == 2)
					q = 1;
				else if (o[i] > 2)
					q = 2;
				else
					q = 0;
				l = p + q;
				c += Math.min(l, 2);
			}
		}
		System.out.println(c);

	}

}
