package Codechef;

import java.util.*;

public class SubArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, j, ctr = 0;
			long p = 1;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				for (j = i; j < n; j++) {
					for (int k = i; k <= j; k++) {
						System.out.print(a[k] + " ");
						p *= a[k];
					}
					ctr++;
					System.out.println();
				}
			}
			System.out.println("Total Subarrays: " + ctr);
			System.out.println("Total Product: " + p);
		}
	}
}
