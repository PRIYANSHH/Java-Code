package CodeIt;

import java.util.*;

class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, key = 0;
		System.out.println("Enter the limit:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long start =  System.nanoTime();
		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		long end =  System.nanoTime();
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Total time taken: " + (end - start)/1000000.0 + " ms");
	}
}