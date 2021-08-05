package CodeIt;

import java.util.Scanner;

public class Sorting {
	static void InsertionSort(int a[],int n) {
		int i,j,key=0;
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
		System.out.println("Total time taken Insertion Sort " + (end - start)/1000000.0 + " ms");
	}
	static void SelectionSort(int a[],int n) {
		int i,j,min=0,pos=0,t=0;
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
		System.out.println("Total time taken by Selection Sort: " + (end - start)/1000000.0 + " ms");
	}
	static void BubbleSort(int a[],int n) {
		int i,j,t=0;
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
		System.out.println("Total time taken by Bubble Sort: " + (end - start)/1000000.0 + " ms");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, t = 0;
		System.out.println("Enter the limit:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			InsertionSort(a,n);
			SelectionSort(a,n);
			BubbleSort(a,n);
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
}
}
