package Codechef;

import java.util.*;

public class chefstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, p1 = 0, p2 = 0, s1, s2;
			int sum1 = 0, sum2 = 0;
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			for (i = 0; i < n; i++) {
				s1 = 0;
				s2 = 0;
				if (a[i] == b[i]) {
					sum1 += 1;
					sum2 += 1;
				} else {
					while (a[i] != 0) {
						p1 = a[i] % 10;
						s1 += p1;
						a[i] = a[i] / 10;
					}
					while (b[i] != 0) {
						p2 = b[i] % 10;
						s2 += p2;
						b[i] = b[i] / 10;
					}
					if (s1 > s2)
						sum1 += 1;
					else if (s1 < s2)
						sum2 += 1;
					else {
						sum1 += 1;
						sum2 += 1;
					}
				}
				System.out.println("s1=" + s1);
				System.out.println("s2=" + s2);
			}
			System.out.println("sum1=" + sum1);
			System.out.println("sum2=" + sum2);
			if (sum1 > sum2)
				System.out.println("0 " + sum1);
			else if (sum1 < sum2)
				System.out.println("1 " + sum2);
			else
				System.out.println("2 " + sum1);

		}
	}
}
