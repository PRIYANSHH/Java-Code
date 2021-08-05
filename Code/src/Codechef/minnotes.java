package Codechef;

import java.util.*;

public class minnotes {
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int prefix[] = new int[n + 2];
			int suffix[] = new int[n + 2];
			prefix[1] = a[0];
			for (i = 2; i <= n; i++)
				prefix[i] = gcd(prefix[i - 1], a[i - 1]);
			suffix[n] = a[n - 1];
			for (i = n - 1; i >= 1; i--)
				suffix[i] = gcd(suffix[i + 1], a[i - 1]);
			b[0] = suffix[2];
			for (i = 2; i < n; i++)
				b[i - 1] = gcd(prefix[i - 1], suffix[i + 1]);
			b[n - 1] = prefix[n - 1];
			int ans = b[0], index = 0;
			long result = 0;
			for (i = 0; i < n; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			for (i = 1; i < n; i++) {
				if (b[i] >= ans) {
					ans = b[i];
					index = i;
				}
			}
			System.out.println(a[index]);
			for (i = 0; i < n; i++) {
				if (i != index)
					result += (a[i] / ans);
			}
			result++;
			System.out.println(result);
		}
	}
}