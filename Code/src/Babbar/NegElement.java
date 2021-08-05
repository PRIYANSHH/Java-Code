package Babbar;

import java.util.Arrays;
import java.util.Scanner;

public class NegElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int low = 0, high = n - 1;
			while (low < high) {
				if (a[low] < 0)
					low++;
				else if (a[high] > 0)
					high--;
				else if (a[low] > 0 && a[high] < 0) {
					a[low] = a[low] ^ a[high];
					a[high] = a[low] ^ a[high];
					a[low] = a[low] ^ a[high];
					low++;
					high--;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

}
