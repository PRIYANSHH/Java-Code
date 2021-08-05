package Codechef;

import java.util.*;

public class restore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int b[] = new int[n];
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				b[i] = sc.nextInt();
			boolean prime[] = new boolean[n + 1];
			for (i = 0; i < n; i++)
				prime[i] = true;

			for (int p = 2; p * p <= n; p++) {
				if (prime[p] == true) {
					for (i = p * p; i <= n; i += p)
						prime[i] = false;
				}
			}
			for (i = 2; i <= n; i++) {
				if (prime[i] == true)
					System.out.print(i + " ");
			}

		}
	}
}