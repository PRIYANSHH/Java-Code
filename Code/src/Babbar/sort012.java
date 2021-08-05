package Babbar;

import java.util.Arrays;
import java.util.Scanner;

public class sort012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int low = 0, mid = 0, high = n - 1;
			while (mid <= high) {
				if (a[mid] == 0) {
					a[low] = a[low] ^ a[mid];
					a[mid] = a[low] ^ a[mid];
					a[low] = a[low] ^ a[mid];
					mid++;
					low++;
				} else if (a[mid] == 1) {
					mid++;
				} else if (a[mid] == 2) {
					a[mid] = a[mid] ^ a[high];
					a[high] = a[mid] ^ a[high];
					a[mid] = a[mid] ^ a[high];
					high--;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}