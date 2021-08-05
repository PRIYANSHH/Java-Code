package DSA;

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		int a[][] = new int[m1][n1];
		for (i = 0; i < m1; i++) {
			for (j = 0; j < n1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		int b[][] = new int[m2][n2];
		for (i = 0; i < m2; i++) {
			for (j = 0; j < n2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		if (n1 != m2)
			System.out.println("Multiplication Not Possible!");
		else {
			int c[][] = new int[m1][n2];
			for (i = 0; i < m1; i++) {
				for (j = 0; j < n2; j++) {
					c[i][j] = 0;
					for (k = 0; k < n1; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			for (i = 0; i < m1; i++) {
				for (j = 0; j < n2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
