package Babbar;

import java.util.Arrays;
import java.util.Scanner;

public class UnionIntersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int m = sc.nextInt();
			int a[] = new int[m];
			int i, j;
			for (i = 0; i < m; i++)
				a[i] = sc.nextInt();
			int n = sc.nextInt();
			int b[] = new int[n];
			for (i = 0; i < n; i++)
				b[i] = sc.nextInt();
			i = 0;
			j = 0;
			// Union
			while (i < m && j < n) {
				if (a[i] < b[j]) {
					System.out.print(a[i] + " ");
					i++;
				} else if (a[i] > b[j]) {
					System.out.print(b[j] + " ");
					j++;
				} else {
					System.out.print(a[i] + " ");
					i++;
					j++;
				}
			}
			while (i < m)
				System.out.print(a[i++] + " ");
			while (j < n)
				System.out.print(b[j++] + " ");
			System.out.println();
		}
	}
}
