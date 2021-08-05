package Codechef;

import java.util.*;

public class drchef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			long a[] = new long[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextLong();
			// First step Sort the array.
			Arrays.sort(a);
			int ans = 0;
			i = -1;
			int cnt = 0;
			// cnt is the counter of number of countries already cured.
			while (i + 1 < n) {
				// finding the right position for x i.e a[i] <= x < a[i+1].
				if (x >= a[i + 1]) {
					i++;
					continue;
				}
				// If v[i]*2>x we deliver to country i.
				if (i >= 0 && (a[i] * 2) > x) {
					x = a[i] * 2;
					cnt++;
					ans++;
					continue;
				}
				// If next element is the last one we keep on delivering it.
				if ((i + 1) == (n - 1)) {
					while (x < a[n - 1]) {
						x = x * 2;
						ans++;
					}
					cnt++;
					ans++;
					break;
				}
				// To double x we deliver last element
				if ((i + 1) != (n - 1) && x <= a[n - 1] / 2) {
					x *= 2;
					ans++;
					continue;
				}
				// We just take (remaining countries+1) days more in this condition.
				if ((i + 1) != (n - 1) && x > a[n - 1] / 2) {
					ans++;
					break;
				}
			}
			ans += (n - cnt);
			System.out.println(ans);
		}
	}
}