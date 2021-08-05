package Codechef;

import java.util.*;

public class blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a[] = new int[n];
			int i, p = 0;
			long sum = 0, flag = -2;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				sum += a[i];
				if (sum >= x && sum <= y) {
					flag = 0;
					break;
				}
			}
			if (flag == 0)
				System.out.println(flag);
		}

	}

}
