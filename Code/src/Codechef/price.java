package Codechef;

import java.util.*;

public class price {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i;
			long sum = 0, sum2 = 0;
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++)
				sum += a[i];
			Arrays.sort(a);
			for (i = n - 1; i > 0; i--) {
				if (a[i] > k)
					a[i] = k;
				else
					break;
			}
			for (i = 0; i < n; i++) {
				sum2 += a[i];
			}
			long s = sum - sum2;
			System.out.println(s);
		}
	}
}
