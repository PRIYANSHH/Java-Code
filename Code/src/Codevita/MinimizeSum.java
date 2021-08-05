package Codevita;

import java.util.*;

public class MinimizeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++)
				b[i] = 1;
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n - 1; i++) {
				if (a[i] < a[i + 1])
					b[i + 1] = b[i] + 1;
				else
					b[i + 1] = 1;
			}
			for (i = n - 1; i > 0; i--) {
				if (a[i] < a[i - 1]) {
					if (b[i] >= b[i - 1])
						b[i - 1] = b[i - 1] + 1;
				}
			}
			int sum = 0;
			for (i = 0; i < n; i++) {
				sum += b[i];
				System.out.print(b[i] + " ");
			}
			System.out.println();
			System.out.println(sum);
		}

	}

}
