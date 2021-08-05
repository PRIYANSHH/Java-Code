package CodeIt;

import java.util.*;

class per {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, i, j, p, n, c, c1, k, k1, y = 0;
		t = sc.nextInt();
		String s;
		for (i = 0; i < t; i++) {
			c = 0;
			c1 = 0;
			k = 0;
			k1 = 0;
			n = sc.nextInt();
			s = sc.next();
			p = 2 * n;
			y = (n / 2) + 1;
			for (j = 0; j < p; j++) {
				if (j % 2 == 0) {
					if (s.charAt(j) == '1')
						c++;
					else
						k++;

				} else {
					if (s.charAt(j) == '1')
						c1++;
					else
						k1++;

				}
				if (c == y && k1 == y && j < p - 1)
					break;
				if (c1 == y && k == y && j < p - 1)
					break;
				if (j == p - 1)
					break;
			}
			System.out.println(j + 1);
		}
	}
}