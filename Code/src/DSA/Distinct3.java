package DSA;

import java.util.*;

public class Distinct3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i, j;
		int a[][] = new int[m][n];
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int k = 1;
		System.out.println("Lower Triangle: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < k; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			k++;
		}
		System.out.println("Upper Triangle: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
