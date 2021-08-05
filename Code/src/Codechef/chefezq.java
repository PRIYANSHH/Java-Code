package Codechef;

import java.util.*;

public class chefezq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int i, flag = 0;
			long sum = 0, day = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < n; i++) {
				sum += (a[i] - k);
				if (sum < 0) {
					flag = 1;
					day = i + 1;
					break;
				}
			}
			if (flag == 0) {
				day = n;
				if (sum > k) {
					day += (sum / k) + 1;
				} else if (sum <= k)
					day++;
			}
			System.out.println(day);
		}

	}

}
