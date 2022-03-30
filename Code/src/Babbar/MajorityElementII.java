package Babbar;

import java.util.*;

public class MajorityElementII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			int count1 = 0, count2 = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == first)
					count1++;
				else if (a[i] == second)
					count2++;
				else if (count1 == 0) {
					first = a[i];
					count1 = 1;
				} else if (count2 == 0) {
					second = a[i];
					count2 = 1;
				} else {
					count1--;
					count2--;
				}
			}
			int ctr1 = 0, ctr2 = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == first)
					ctr1++;
				else if (a[i] == second)
					ctr2++;
			}
			int x = 0, y = 0;
			if (ctr1 > (n / 3) && x++ >= 0)
				System.out.println(first);
			if (ctr2 > (n / 3) && y++ >= 0)
				System.out.println(second);
			if (x == 0 && y == 0)
				System.out.println("Majority does not exist");
		}
	}
}
