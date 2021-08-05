package DSA;

import java.util.*;

class clockwise {
	static void rotateMatrix(int m, int n, int a[][]) {
		int i, r = 0, c = 0;
		int m1 = m, n1 = n;
		int prev, curr;
		while (r < m && c < n) {
			if (r + 1 == m || c + 1 == n)
				break;
			prev = a[r + 1][c];
			for (i = c; i < n; i++) {
				curr = a[r][i];
				a[r][i] = prev;
				prev = curr;
			}
			r++;
			for (i = r; i < m; i++) {
				curr = a[i][n - 1];
				a[i][n - 1] = prev;
				prev = curr;
			}
			n--;
			if (r < m) {
				for (i = n - 1; i >= c; i--) {
					curr = a[m - 1][i];
					a[m - 1][i] = prev;
					prev = curr;
				}
			}
			m--;
			if (c < n) {
				for (i = m - 1; i >= r; i--) {
					curr = a[i][c];
					a[i][c] = prev;
					prev = curr;
				}
			}
			c++;
		}
		for (i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		rotateMatrix(m, n, a);
	}
}