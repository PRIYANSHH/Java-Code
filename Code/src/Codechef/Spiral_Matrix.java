package Codechef;

import java.util.*;

public class Spiral_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[][] = new int[m][n];
			int b[] = new int[m * n];
			int i, j = 0, k = 0, l = 0;
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int p = 0;
			while (k < m && l < n) {
				// Print the first row from the remaining rows
				for (i = l; i < n; ++i) {
					b[p++] = a[k][i];
				}
				k++;

				// Print the last column from the remaining columns
				for (i = k; i < m; ++i) {
					b[p++] = a[i][n - 1];
				}
				n--;

				// Print the last row from the remaining rows */
				if (k < m) {
					for (i = n - 1; i >= l; --i) {
						b[p++] = a[m - 1][i];
					}
					m--;
				}

				// Print the first column from the remaining columns */
				if (l < n) {
					for (i = m - 1; i >= k; --i) {
						b[p++] = a[i][l];
					}
					l++;
				}
			}
			for (i = 0; i < p; i++) {
				if ((i + 1) % m == 0)
					System.out.println("i+1: " + (i + 1));
				System.out.print(b[i] + " ");
			}
		}
	}
}