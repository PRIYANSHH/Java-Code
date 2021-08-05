package Codechef;

import java.util.*;

public class AugCook1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int i, c = 1, flag = 0, p = 0, len = 0, ll = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if (a[i] > k)
					len++;
			}
			if (n == 1 && a[n - 1] > k) {
				System.out.println("-1");
			} else if (n == 1 && a[n - 1] <= k)
				System.out.println("1");
			else {
				for (i = 0; i < n; i++) {
					p += a[i];
					if (p > k && a[i] <= k) {
						c++;
						ll++;
						p = a[i];
					} else if (a[i] > k) {
						flag = 1;
						break;
					}
				}
				if (len == n || ll == 0)
					System.out.println("-1");
				else
					System.out.println(c);
			}
		}
	}
}