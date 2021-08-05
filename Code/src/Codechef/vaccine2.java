package Codechef;

import java.util.*;

public class vaccine2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a[] = new int[n];
			int i, ctr1 = 0, ctr2 = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if (a[i] >= 80 || a[i] <= 9)
					ctr1++;
				else
					ctr2++;
			}
			double d1 = (double) ctr1 / (double) d;
			double d2 = (double) ctr2 / (double) d;
			System.out.println((int) (Math.ceil(d1) + Math.ceil(d2)));
		}

	}

}
