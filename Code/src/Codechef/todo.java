package Codechef;

import java.util.*;

public class todo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			int k = 0;
			if (s > n) {
				k = s / n;
				if (s % n != 0) {
					if ((s % n) == 1 || ((s % n) & 1) == 0) {
						k = k + 1;
					} else if (((s % n) & 1) == 1) {
						k = k + 2;
					}
				}
			} else if (s == n) {
				k = 1;
			} else {
				if (s == 1 || (s & 1) == 0)
					k = 1;
				else if ((s & 1) == 1)
					k = 2;
			}
			System.out.println(k);
		}
	}
}
