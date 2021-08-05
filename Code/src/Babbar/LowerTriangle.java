package Babbar;

import java.util.*;

public class LowerTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[][] = new int[m][n];
			int i, j;
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Lower Triangle: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					if (i > j)
						System.out.print(a[i][j] + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println("Diagonal: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					if (i == j)
						System.out.print(a[i][j] + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println("Upper Triangle: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					if (i < j)
						System.out.print(a[i][j] + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println("Upper & Lower Triangle: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					if (i != j)
						System.out.print(a[i][j] + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println("Full Matrix: ");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
