package Codechef;

import java.util.*;

public class wipl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long total = 0;
			int h[] = new int[n];
			int i;
			for (i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				total += h[i];
			}
			Arrays.sort(h);
			if (total < (k + k))
				System.out.println("-1");
			else if (k <= h[n - 1]) {
				long sum = 0, ctr = 0;
				ctr++;
				for (i = n - 2; i >= 0; i--) {
					if (sum < k) {
						sum += h[i];
						ctr++;
					} else
						break;
				}
				if (sum >= k)
					System.out.println(ctr);
				else
					System.out.println("-1");
			} else {
				HashSet<Integer> h1 = new HashSet<Integer>();
				h1.add(h[n - 1]);
				long sum = 0, ctr = -1;
				sum += h[n - 1];
				for (i = n - 2; i >= 0; i--) {
					HashSet<Integer> h2 = new HashSet<Integer>();
					sum += h[i];
					for (int a : h1) {
						h2.add(a);
						h2.add(h[i]);
						h2.add(a + h[i]);
						if (((a + h[i]) >= k) && ((sum - (a + h[i])) >= k)) {
							ctr = n - i;
							break;
						}
					}
					h1 = h2;
					if (ctr != -1)
						break;
				}
				System.out.println(ctr);
			}
		}
	}
}