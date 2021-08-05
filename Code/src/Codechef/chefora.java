package Codechef;

import java.util.*;

public class chefora {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long arr1[] = new long[100001];
		for (int j = 1; j <= 100000; j++) {
			String str1 = Long.toString(j);
			StringBuffer str3 = new StringBuffer(str1.substring(0, str1.length() - 1));
			arr1[j] = Long.parseLong(str1 + str3.reverse());
		}
		long presum[] = new long[100001];
		presum[1] = 1;
		for (int j = 1; j <= 100000; j++) {
			presum[j] = presum[j - 1] + arr1[j];
		}
		while (q-- > 0) {
			int mod = 1000000007;
			int l = sc.nextInt();
			int r = sc.nextInt();
			long rr = (arr1[l]) % mod;
			long sum = 0;
			long result;
			sum = presum[r] - presum[l];
			result = power(rr, sum, mod) % mod;
			System.out.println(result);
		}
	}
}
