package Codechef;

import java.util.*;

public class SeptLunch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, flag = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				if ((i + 1) % a[i] != 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
