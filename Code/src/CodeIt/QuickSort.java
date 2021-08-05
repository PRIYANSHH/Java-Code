package CodeIt;

import java.util.*;

class QuickSort {
	static int partition(int a[], int low, int high) {
		int p = a[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (a[j] < p) {
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i + 1];
		a[i + 1] = a[high];
		a[high] = t;

		return i + 1;
	}

	static void sort(int a[], int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	static void printArray(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sort(a, 0, n - 1);

		System.out.println("Sorted Array: ");
		printArray(a);
	}
}