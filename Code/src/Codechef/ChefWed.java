package Codechef;

import java.util.*;

class ChefWed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
			int i, sum = 1, j, flag = 0, g = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int l = 0;
			int max = 0;
			for (i = 0; i < n; i++) {
				for (j = 0; j < l; j++) {
					if (b[j] == a[i]) {
						flag = 1;
						break;
					}
				}
				if (flag != 1)
					b[l++] = a[i];
				else {
					flag = 0;
					sum++;
					c[g++] = l;
					l = 0;
					b[l++] = a[i];
				}
			}
			c[g++] = l;
			for (i = 0; i < g; i++)
				System.out.print(c[i] + " ");
			System.out.println();
			max = k * sum;
			int sum3 = 0;
			int r[][] = new int[n][n];
			if (k == 1)
				System.out.println(max);
			else {
				for (i = 0; i < n; i++) {
					for (j = i; j < n; j++) {
						Map<Integer, Integer> mp1 = new HashMap<>();
						for (int e = i; e <= j; e++) {
							if (mp1.containsKey(a[e])) {
								mp1.put(a[e], mp1.get(a[e]) + 1);
							} else {
								mp1.put(a[e], 1);
							}
						}
						for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
							if (entry.getValue() > 1) {
								sum3 += entry.getValue();
							}
						}
						r[i][j] = sum3;
						sum3 = 0;
					}
				}
				for (i = 0; i < n; i++) {
					for (j = 0; j < n; j++) {
						System.out.print(r[i][j] + " ");
					}
					System.out.println();
				}
				int pp[] = new int[n];
				int y, ff = 0;
				int z = Integer.MAX_VALUE;
				for (i = 2; i < g; i++) {
					for (j = 0; j < n - 1; j++) {
						y = r[0][0] + r[0][j] + r[j + 1][n - 1];
						if (y < z)
							z = y;
					}
					pp[ff++] = z;
				}
				Arrays.sort(pp, 0, ff);
				for (i = 0; i < ff; i++)
					System.out.print(pp[i] + " ");
				System.out.println();
				int sum11=0,q=0,qq=0;
				System.out.println(2 * k + pp[0]);
			/*	for(i=0;i<n;i++) {
					for(j=q;j<n;j++) {
						if(r[i][j]!=0) {
							sum11+=r[i][j];
							q=j++;
							i=q;
							qq++;
							break;
						}
					}
					System.out.println(i+" "+j);
				}
				System.out.println(sum11+" "+qq);*/
				/*
				 * for (i = 0; i < n; i++) System.out.println(r[0][i] + r[i][n - 1]); if (max >
				 * (k + r[0][n - 1])) System.out.println(k + r[0][n - 1]); else {
				 * System.out.println(max); }
				 */
			}
			System.out.println("1 table: " + (k + r[0][n - 1]));
			System.out.println(g + " table: " + max);
		}
	}
}