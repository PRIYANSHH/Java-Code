package Codevita;

import java.util.*;

public class RailwayStation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, p;
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				p = sc.nextInt();
				b[i] = a[i] + p;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int ctr = 1, j = 0, res = 1;
			for (i = 1; i < n; i++) {

				if (a[i] < b[j]) {
					ctr++;
				} else {
					ctr--;
					j++;
					i--;
				}
				res = Math.max(res, ctr);
			}
			System.out.println(res);
		}
	}

}
