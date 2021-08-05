package CodeIt;

import java.util.*;

class str {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, x, y, n, i;
		String s;
		char ch;
		char p, q;
		t = sc.nextInt();
		while (t-- > 0) {
			x = 0;
			y = 0;
			n = sc.nextInt();
			s = sc.next();
			p = ' ';
			q = ' ';
			if (s.length() == n) {
				for (i = 0; i < n; i++) {
					ch = s.charAt(i);
					System.out.println(x + " " + y);
					if (p == ch || ch == q)
						continue;
					if (ch == 'U') {
						x = x;
						y = y + 1;
						q = 'D';
					} else if (ch == 'L') {
						x = x - 1;
						y = y;
						q = 'R';
					} else if (ch == 'R') {
						x = x + 1;
						y = y;
						q = 'L';
					} else if (ch == 'D') {
						x = x;
						y = y - 1;
						q = 'U';
					}
					p = ch;
				}
				System.out.println(x + " " + y);
			}
		}
	}
}