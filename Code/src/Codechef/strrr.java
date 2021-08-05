package Codechef;

import java.util.*;

public class strrr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int i, j;
			long k;
			int n = sc.nextInt();
			long a[] = new long[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextLong();
			Set<Long> result = new HashSet<>();
			long b[] = new long[n];
			long p = -1;
			for (i = 0; i < n; i++) {
				if (a[i] == p) {
					b[i] = a[i];
					continue;
				}
				p = a[i];
				if (a[i] == 0) {
					result.add((long) 0);
				} else {
					for (j = i; j >= 0; j--) {
						k = (a[i] | b[j]);
						if (k == b[j])
							break;
						else {
							b[j] = k;
							result.add(k);
						}
					}
				}
			}
			if (result.size() == (n * (n + 1) / 2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}