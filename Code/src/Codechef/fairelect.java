package Codechef;

import java.util.*;

public class fairelect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			int i;
			long sum1 = 0, sum2 = 0;
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum1 += a[i];
			}
			for (i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				sum2 += b[i];
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int ii = 0, jj = m - 1, tot = 0;
			while (ii < n && jj >= 0) {
				if (sum1 <= sum2) {
					sum1 -= a[ii];
					sum1 += b[jj];
					sum2 -= b[jj];
					sum2 += a[ii];
					tot++;
				} else
					break;
				ii++;
				jj--;
			}
			if (sum1 > sum2)
				System.out.println(tot);
			else
				System.out.println("-1");
		}

	}

}
