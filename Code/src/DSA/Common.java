package DSA;

import java.util.*;

public class Common {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, l = 0, ctr = 1, p = 0;
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 1; j < m; j++) {
				for (k = 0; k < n; k++) {
					if (a[0][i] == a[j][k]) {
						ctr++;
						p = a[0][i];
						a[j][k]=-1;
						break;
					}
				}
			}
			if (ctr == m)
				System.out.print(p+" ");
			ctr = 1;
		}
		System.out.println();
	}
}