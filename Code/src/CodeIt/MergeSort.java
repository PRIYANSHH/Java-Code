package CodeIt;

import java.util.Scanner;

class MergeSort {
	void merge(int a[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; i++)
			left[i] = a[l + i];
		for (int j = 0; j < n2; j++)
			right[j] = a[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = right[j];
			j++;
			k++;
		}
	}

	void sort(int a[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(a, l, m);
			sort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	static void printArray(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println("Given Array: ");
		printArray(a);

		MergeSort ob = new MergeSort();
		ob.sort(a, 0, n - 1);

		System.out.println("Sorted array: ");
		printArray(a);
	}
}