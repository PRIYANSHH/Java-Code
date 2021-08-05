package Codechef;

import java.util.*;

public class vaccine1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int v1 = sc.nextInt();
		int d2 = sc.nextInt();
		int v2 = sc.nextInt();
		int p = sc.nextInt();
		int diff = 0, sum = 0, flag = 0, c1 = d1 - 1, c2 = d2 - 1;
		if (d1 > d2) {
			diff = d1 - d2;
			for (int i = d2; i < d1; i++) {
				sum += v2;
				if (sum >= p) {
					flag = i;
					break;
				}
			}
			if (flag == 0) {
				while (sum < p) {
					sum += (v1 + v2);
					c1++;
				}
			}
		} else if (d1 < d2) {
			diff = d2 - d1;
			for (int i = d1; i < d2; i++) {
				sum += v1;
				if (sum >= p) {
					flag = i;
					break;
				}
			}
			if (flag == 0) {
				while (sum < p) {
					sum += (v1 + v2);
					c2++;
				}
			}
		} else {
			while (sum < p) {
				sum += (v1 + v2);
				c2++;
			}
		}
		if (flag != 0)
			System.out.println(flag);
		else
			System.out.println(Math.max(c1, c2));
	}
}
