package Codechef;

import java.util.*;

public class subFreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			long m = 1000000007;
			for (i = 0; i < n; i++) {
				long x = 2;
				long rem = 0;
				String str = Integer.toString(i);
				for (int j = 0; j < str.length(); j++)
					rem = (rem * 10 + str.charAt(j) - '0') % (m - 1);
				long res = 1;
				x = x % m;
				while (rem > 0) {
					if ((rem & 1) == 1)
						res = (res * x) % m;
					rem = rem >> 1;
					x = (x * x) % m;
				}
				System.out.print(res + " ");
			}
			System.out.println();
		}
	}
}