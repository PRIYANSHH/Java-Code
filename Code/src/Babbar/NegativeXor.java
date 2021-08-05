package Babbar;

import java.util.*;

public class NegativeXor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int x = 0;
			for (i = 0; i < n; i++) {
				x = x ^ a[i];
				System.out.print(x + " ");
			}
			System.out.println("\n" + x);
		}
	}
}