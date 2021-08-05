package Codechef;

import java.util.*;

public class antschef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int i, j;
			long pro = 0;
			if (n == 1) {
				int m = sc.nextInt();
				int a[] = new int[m];
				long pos = 0, neg = 0;
				for (j = 0; j < m; j++) {
					a[j] = sc.nextInt();
					if (a[j] >= 0)
						pos++;
					else
						neg++;
				}
				pro = pos * neg;
				System.out.println(pro);
			} else {
				for (i = 0; i < n; i++) {
					int m = sc.nextInt();
					int a[] = new int[m];
					for (j = 0; j < m; j++)
						a[j] = sc.nextInt();
				}
				System.out.println();
			}
		}
	}
}
