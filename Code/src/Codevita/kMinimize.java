package Codevita;

import java.util.Scanner;

public class kMinimize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int i, j;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < k; i++) {
				int max = Integer.MIN_VALUE;
				int t = 0;
				for (j = 0; j < n; j++) {
					if (a[j] > max) {
						max = a[j];
						t = j;
					}
				}
				a[t] = a[t] / 2;
			}
			int sum = 0;
			for (i = 0; i < n; i++)
				sum += a[i];
			System.out.println(sum);

		}
	}

}
