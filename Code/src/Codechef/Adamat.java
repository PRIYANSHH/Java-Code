package Codechef;

import java.util.*;

public class Adamat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			int i, j, k, ctr = 0, temp = 0;
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			i = 0;
			for (j = n - 1; j >= 0; j--) {
				if (a[i][j] != i * n + (j + 1)) {
					ctr++;
					for (k = 0; k <= j; k++) {
						temp = a[i][k];
						a[i][k] = a[k][i];
						a[k][i] = temp;
					}
				}
			}
			System.out.println(ctr);
		}

	}

}
