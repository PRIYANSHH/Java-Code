package CodeIt;

import java.util.*;

class strno {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, j, x, k, i, len;
		t = sc.nextInt();
		while (t-- > 0) {
			j = 0;
			x = sc.nextInt();
			k = sc.nextInt();
			int a[] = new int[1000];
			while (x % 2 == 0) {
				a[j++] = 2;
				x /= 2;
			}
			for (i = 3; i <= Math.sqrt(x); i += 2) {
				while (x % i == 0) {

					a[j++] = i;
					x /= i;
				}

			}
			if (x > 2)
				a[j++] = x;
			if (j >= k)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}
}