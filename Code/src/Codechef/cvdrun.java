package Codechef;

import java.util.*;

public class cvdrun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == y)
				System.out.println("YES");
			else if (k == 0 && x != y)
				System.out.println("NO");
			else if (k == 0 && x == y)
				System.out.println("YES");
			else if (k == 1)
				System.out.println("YES");
			else {
				int p = x, flag = 0, qu = n;
				if (n % k == 0)
					qu = n / k;
				for (int i = 0; i < qu; i++) {
					if (p == y) {
						flag = 1;
						break;
					}
					p = (p + k) % n;
				}
				if (flag == 0)
					System.out.println("NO");
				else
					System.out.println("YES");
			}

		}

	}

}
