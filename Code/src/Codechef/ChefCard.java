package Codechef;

import java.util.*;

public class ChefCard {

	static long power(long a, long b, long m) {
		long res = 1;
		a = a % m;
		while (b > 0) {
			res = res % m;
			if ((b & 1) == 1)
				res = (res % m * a % m) % m;
			b /= 2;
			a = (a % m * a % m) % m;

		}
		return res;
	}

	static long inverse(long n, long m) {
		return power(n, m - 2, m);
	}

	static long modfunc(long n, long r, long m) {
		if (r == 0)
			return 1;
		long[] fact = new long[(int) n + 1];
		fact[0] = 1;
		for (int i = 1; i <= n; i++)
			fact[i] = fact[i - 1] * i % m;
		return (fact[(int) n] * inverse(fact[(int) r], m) % m * inverse(fact[(int) (n - r)], m) % m) % m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, ctr = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			long max = -1;
			for (i = 0; i < n; i++) {
				if (a[i] > max)
					max = a[i];
			}
			for (i = 0; i < n; i++) {
				if (a[i] == max)
					ctr++;
			}
			long calc = 1;
			long mod = 1000000007;
			calc = power(2, n, mod) % mod;
			if ((ctr & 1) == 1) {
				System.out.println(calc % mod);
			} else {
				long result = modfunc(ctr, ctr / 2, mod) % mod;
				long cp = (n - ctr);
				long cal = 1, res;
				cal = power(2, cp, mod) % mod;
				res = (((result % mod) * (cal % mod)) % mod);
				long resu = (calc % mod - res % mod) % mod;
				if (resu < 0)
					resu = (resu + mod) % mod;
				System.out.println(resu % mod);
			}
		}
	}
}