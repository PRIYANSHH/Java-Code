package Codechef;

import java.util.*;

public class SeptL2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
			int i, p = 0, ok = 0, pp = 0;
			String s = sc.next();
			int ff = 0;
			for (i = 0; i < n; i++) {
				if (p == 0 && s.charAt(i) == '0')
					ok++;
				if (s.charAt(i) == '1') {
					a[p] = 1;
					b[p] = i;
					pp = i;
					ff = p;
					p++;
				}
			}
			for (i = 0; i < p - 1; i++) {
				c[i] = b[i + 1] - b[i] - 1;
			}
			int flag1 = 0, flag2 = 0;
			if (ok != 0) {
				flag1 = 1;
				c[p++] = ok;
			}
			if ((n - 1) - pp > 0) {
				flag2 = 1;
				c[p++] = (n - 1) - pp;
			}
			Arrays.sort(c, 0, p);
			int sum = 0;
			int f1 = 0, f2 = 0, l = 0;
			if (k == 0)
				System.out.println(n - 1 - ff);
			else if (k == 1) {
				for (i = 0; i < p; i++) {
					if (c[i] != 0 && c[i] == ok && f1 == 0 && flag1 == 1 && ok >= (n - 1 - pp)) {
						f1 = 1;
						k--;
						c[i] = 0;
						break;
					} else if (c[i] != 0 && c[i] == ((n - 1) - pp) && f2 == 0 && flag2 == 1 && (ok <= (n - 1 - pp))) {
						f2 = 1;
						k--;
						c[i] = 0;
						break;
					}
				}
				for (i = 0; i < p; i++)
					sum += c[i];
				System.out.println(sum);

			} else if (k == 2 && ok > 0 && (n - 1 - pp) > 0) {
				int h = 0;
				for (i = 0; i < p; i++) {
					if (c[i] != 0 && c[i] == ok && f1 == 0 && flag1 == 1 && ok >= (n - 1 - pp)) {
						f1 = 1;
						k--;
						l = i;
						c[i] = 0;
						h++;
					} else if (c[i] != 0 && c[i] == ((n - 1) - pp) && f2 == 0 && flag2 == 1 && (ok <= (n - 1 - pp))) {
						f2 = 1;
						k--;
						l = i;
						c[i] = 0;
						h++;
					}
					if (h == 2)
						break;
				}
				for (i = 0; i < p; i++)
					sum += c[i];
				System.out.println(sum);
			} else {
				for (i = p - 1; i >= 0; i--) {
					if (k > 0) {
						if (c[i] != 0 && c[i] == ok && f1 == 0 && flag1 == 1) {
							f1 = 1;
							k--;
						} else if (c[i] != 0 && c[i] == ((n - 1) - pp) && f2 == 0 && flag2 == 1) {
							f2 = 1;
							k--;
						} else if (c[i] != 0) {
							k = k - 2;
						}
						if (k < 0)
							sum++;
					} else {
						if (c[i] != 0)
							sum += c[i];
					}
				}
				System.out.println(sum);
			}

		}

	}

}
