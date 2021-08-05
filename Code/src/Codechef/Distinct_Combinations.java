package Codechef;

import java.util.*;

public class Distinct_Combinations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, j;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			for (i = 0; i < n; i++) {
				for (j = i + 1; j < n; j++) {
					System.out.print("[" + a[i] + ", " + a[j] + "]  ");
				}
			}
			System.out.println();
		}
	}
}