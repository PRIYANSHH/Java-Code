package Codechef;

import java.util.*;

public class doof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, flag;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int q = sc.nextInt();
			for (int j = 0; j < q; j++) {
				flag = 0;
				int ctr = 0;
				int x = sc.nextInt();
				int y = sc.nextInt();
				int mid = n / 2;
				i = 0;
				int k = n - 1;
				while (i <= k) {
					if (a[mid] < (x + y)) {
						i = mid + 1;
						ctr = mid + 1;
					} else if (a[mid] == (x + y)) {
						flag = 1;
						break;
					} else {
						k = mid - 1;
					}
					mid = (i + k) / 2;
				}
				if ((x + y) == 0)
					System.out.println("0");
				else if (flag == 1)
					System.out.println("-1");
				else
					System.out.println(ctr);
			}
		}
	}
}
