package Codechef;

import java.util.*;

public class SeptLunch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, u, v, ctr = 0;
			for (i = 0; i < n - 1; i++) {
				u = sc.nextInt();
				v = sc.nextInt();
				a[--v]++;
			}
			for (i = 0; i < n; i++) {
				if (a[i] == 0)
					ctr++;
			}
			System.out.println((ctr - 1));
		}
	}
}
