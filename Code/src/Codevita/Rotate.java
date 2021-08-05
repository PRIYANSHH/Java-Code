package Codevita;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[][] = new int[m][n];
			int l = (m < n) ? m : n;
			int b[] = new int[l / 2];
			int i, j;
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for (i = 0; i < l / 2; i++)
				b[i] = sc.nextInt();
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			int k, o = 0, op = 0;
			int top = 0, bot = m - 1, left = 0, right = n - 1;
			for (int u = 0; u < l / 2; u++) {
				int prev = a[top][left];
				int prev2 = a[top][right];
				int pp = b[u];
				int curr = 0, dir = 0;
				if (((u + 1) & 1) == 1) {
					for (int y = 0; y < pp; y++) {
						dir = 0;
						if (y != 0)
							prev = o;
						if (dir == 0) {
							for (k = left; k < right; k++) {
								curr = a[top][k + 1];
								a[top][k + 1] = prev;
								prev = curr;
							}
							dir++;
						}
						if (dir == 1) {
							for (k = top; k < bot; k++) {
								curr = a[k + 1][right];
								a[k + 1][right] = prev;
								prev = curr;
							}
							dir++;
						}
						if (dir == 2) {
							for (k = right; k > left; k--) {
								curr = a[bot][k - 1];
								a[bot][k - 1] = prev;
								prev = curr;
							}
							dir++;
						}
						if (dir == 3) {
							for (k = bot; k > top; k--) {
								curr = a[k - 1][left];
								a[k - 1][left] = prev;
								o = prev;
								prev = curr;
							}
							dir++;
						}
					}
				} else {
					for (int y = 0; y < pp; y++) {
						dir = 0;
						if (y != 0)
							prev2 = op;
						if (dir == 0) {
							for (k = right; k > left; k--) {
								curr = a[top][k - 1];
								a[top][k - 1] = prev2;
								prev2 = curr;
							}
							dir++;
						}
						if (dir == 1) {
							for (k = top; k < bot; k++) {
								curr = a[k + 1][left];
								a[k + 1][left] = prev2;
								prev2 = curr;
							}
							dir++;
						}
						if (dir == 2) {
							for (k = left; k < right; k++) {
								curr = a[bot][k + 1];
								a[bot][k + 1] = prev2;
								prev2 = curr;
							}
							dir++;
						}
						if (dir == 3) {
							for (k = bot; k > top; k--) {
								curr = a[k - 1][right];
								a[k - 1][right] = prev2;
								op = prev2;
								prev2 = curr;
							}
							dir++;
						}
					}
				}
				top++;
				left++;
				right--;
				bot--;
			}
			System.out.println("Rotated: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}