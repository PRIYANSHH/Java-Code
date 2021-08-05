package Coursera;

import java.util.*;

public class allzeroesatend {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, count = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if (a[i] != 0)
					System.out.print(a[i] + " ");
				else
					count++;
			}
			for (i = 0; i < count; i++)
				System.out.print("0 ");
			System.out.println();
		}
	}
}
