package Codechef;

import java.util.*;

public class AugLunch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int i, j, c = 0;
			int a[] = new int[n];
			int b[] = new int[m];
			int mm[][] = new int[n][m];
			int rank[][] = new int[n][m];
			int rate[][] = new int[n][m];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					b[j] = sc.nextInt();
				}
				int p = a[i];

				for (j = 0; j < m; j++) {
					p += b[j];
					mm[i][j] = p;
				}
			}
			for (int k = 0; k < m; k++) {
				for (i = 0; i < n; i++) {
					int curRank = 1;
					for (j = 0; j < i; j++) {

						if (mm[i][k] < mm[j][k]) {
							curRank++;
						} else if (mm[i][k] > mm[j][k]) {
							rank[j][k]++;
						}
					}

					rank[i][k] = curRank;
				}
			}
			for (int k = 0; k < n; k++) {
				for (i = 0; i < m; i++) {
					int curr = 1;
					for (j = 0; j < i; j++) {

						if (mm[k][i] < mm[k][j]) {
							curr++;
						} else if (mm[k][i] > mm[k][j]) {
							rate[k][j]++;
						}
					}

					rate[k][i] = curr;
				}
			}
			for (i = 0; i < n; i++) {
				int min = Integer.MAX_VALUE;
				for (j = 0; j < m; j++) {
					if (rank[i][j] < min)
						min = rank[i][j];
				}
				for (j = 0; j < m; j++) {
					if (rank[i][j] == min)
						rank[i][j] = 1;
					else
						rank[i][j] = 0;
				}
			}
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (rank[i][j] == 1 && rate[i][j] != 1) {
						c++;
						break;
					}
				}
			}
			System.out.println(c);
		}
	}
}