package Babbar;

import java.util.*;

public class MajorityElementIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int i;
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			int third = Integer.MIN_VALUE;
			int ctr1 = 0, ctr2 = 0, ctr3 = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == first)
					ctr1++;
				else if (a[i] == second)
					ctr2++;
				else if (a[i] == third)
					ctr3++;
				else if (ctr1 == 0) {
					first = a[i];
					ctr1 = 1;
				} else if (ctr2 == 0) {
					second = a[i];
					ctr2 = 1;
				} else if (ctr3 == 0) {
					third = a[i];
					ctr3 = 1;
				} else {
					ctr1--;
					ctr2--;
					ctr3--;
				}
			}
			int c1 = 0, c2 = 0, c3 = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == first)
					c1++;
				else if (a[i] == second)
					c2++;
				else if (a[i] == third)
					c3++;
			}
			List<Integer> list = new ArrayList<>();
			if (c1 > (n / 4))
				list.add(first);
			if (c2 > (n / 4))
				list.add(second);
			if (c3 > (n / 4))
				list.add(third);
			System.out.println(list);
		}

	}

}
