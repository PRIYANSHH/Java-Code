package Codechef;

import java.util.*;

public class billrd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == y)
				System.out.println(n + " " + n);
			else {
				if (x > y) {
					int x1 = n;
					int y1 = n - (x - y);
					int x2 = y1;
					int y2 = x1;
					int x3 = 0;
					int y3 = Math.abs(x2 - y2);
					int x4 = y3;
					int y4 = x3;
					int tp = 0;
					if (k <= 4)
						tp = k;
					else {
						tp = k % 4;
						if (tp == 0)
							tp = 4;
					}
					if (tp == 1)
						System.out.println(x1 + " " + y1);
					else if (tp == 2)
						System.out.println(x2 + " " + y2);
					else if (tp == 3)
						System.out.println(x3 + " " + y3);
					else if (tp == 4)
						System.out.println(x4 + " " + y4);
				} else {
					int x1 = n - (y - x);
					int y1 = n;
					int x2 = y1;
					int y2 = x1;
					int x3 = Math.abs(x2 - y2);
					int y3 = 0;
					int x4 = y3;
					int y4 = x3;
					int tp = 0;
					if (k <= 4)
						tp = k;
					else {
						tp = k % 4;
						if (tp == 0)
							tp = 4;
					}
					if (tp == 1)
						System.out.println(x1 + " " + y1);
					else if (tp == 2)
						System.out.println(x2 + " " + y2);
					else if (tp == 3)
						System.out.println(x3 + " " + y3);
					else if (tp == 4)
						System.out.println(x4 + " " + y4);
				}
			}
		}
	}
}
