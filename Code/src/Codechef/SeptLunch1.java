package Codechef;

import java.util.*;

public class SeptLunch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, sum = 0;
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			if (sum >= 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
