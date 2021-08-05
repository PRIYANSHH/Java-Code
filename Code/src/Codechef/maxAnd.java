package Codechef;

import java.util.*;

public class maxAnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = m * n;
			int c = 0, p;
			if (z == 1)
				System.out.println(x);
			else {
				if ((y >= x) && ((z & 1) == 0)) {
					p = y - x;
					if (p > x)
						p = x;
					c = ((z / 2) * x) + ((z / 2) * p);
				} else if ((y >= x) && ((z & 1) == 1)) {
					p = y - x;
					if (p > x)
						p = x;
					c = (((z / 2) + 1) * x) + ((z / 2) * p);
				} else if ((y < x) && ((z & 1) == 0))
					c = (((z / 2)) * y);
				else if ((y < x) && ((z & 1) == 1))
					c = (((z / 2) + 1) * y);
				System.out.println(c);
			}
		}
	}
}