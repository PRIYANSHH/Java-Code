package CodeIt;

import java.util.*;

class SelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, t = 0, min = 0, pos = 0;
		System.out.println("Enter the limit:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long start = System.nanoTime();
		for (i = 0; i < n - 1; i++) {
			min = a[i];
			pos = i;
			for (j = i + 1; j < n; j++) {
				if (a[j] < min) {
					min = a[j];
					pos = j;
				}
			}
			if (pos != i) {
				t = a[i];
				a[i] = a[pos];
				a[pos] = t;
			}
		}
		long end = System.nanoTime();
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Total time taken: " + (end - start)/1000000.0 + " ms");
	}
}