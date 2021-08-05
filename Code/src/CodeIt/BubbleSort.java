package CodeIt;

import java.util.*;

class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, t = 0;
		System.out.println("Enter the limit:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long start = System.nanoTime();
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		long end = System.nanoTime();
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Total time taken: " + (end - start)/1000000.0 + " ms");
	}
}