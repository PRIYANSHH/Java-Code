package CodeIt;

import java.util.*;

class candy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, k, c, p, i;
		t = sc.nextInt();
		while (t-- > 0) {
			c = 1;
			p = 0;
			n = sc.nextInt();
			k = sc.nextInt();
			if (n % 2 == 0)
				c = (n / 2) + ((n / 2) * (k + 1));
			else
				c = (n / 2) + ((n / 2) * (k + 1)) + (k + k + 1);
			System.out.println(c);
		}
	}
}