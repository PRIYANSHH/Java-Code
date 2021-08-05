package Codechef;

import java.util.*;

public class Absolute_Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[m];
			int b[] = new int[n];
			int i, j, diff = 0, p1 = 0, p2 = 0;
			for (i = 0; i < m; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++)
				b[i] = sc.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			int ab = Integer.MAX_VALUE;
			i = 0;
			j = 0;
			while (i < m && j < n) {
				diff = Math.abs(a[i] - b[j]);
				if (diff < ab) {
					ab = diff;
					p1 = a[i];
					p2 = b[j];
				}
				if (a[i] < b[j])
					i++;
				else
					j++;
			}
			System.out.println("Pairs: [" + p1 + ", " + p2 + "]");
			System.out.println("Difference: " + ab);
		}

	}

}