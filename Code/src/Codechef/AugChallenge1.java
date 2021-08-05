package Codechef;

import java.util.*;

public class AugChallenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, l = 0, s = 0, ele = 0, flag = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int min = Integer.MAX_VALUE;
			for (i = 0; i < n; i++) {
				if (k % a[i] == 0) {
					s = k / a[i];
					if (s < min) {
						min = s;
						ele = a[i];
						flag = 1;
					}
				}
			}
			if (flag == 1)
				System.out.println(ele);
			else
				System.out.println("-1");

		}

	}

}
