package Codechef;

import java.util.*;

public class icecream {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i, x = 0, y = 0, flag = 0;
			int n = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (i = 0; i < n; i++) {
				if (a[i] - 5 == 0)
					x++;
				else if (a[i] - 5 == 5) {
					if (x > 0) {
						x--;
						y++;
					} else
						flag = 1;
				} else if (a[i] - 5 == 10) {
					if (y > 0)
						y--;
					else if (x > 1)
						x = x - 2;
					else
						flag = 1;
				} else
					flag = 1;
			}
			if (flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}