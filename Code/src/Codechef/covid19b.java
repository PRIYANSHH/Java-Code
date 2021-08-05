package Codechef;

import java.util.*;

public class covid19b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			boolean arr[] = new boolean[n];
			int i, j, op = 0;
			double t;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = 0, l = 0;
			for (i = 0; i < n; i++) {
				for (l = 0; l < n; l++)
					arr[l] = false;
				arr[i] = true;
				for (j = 0; j < n; j++) {
					if ((a[j] > a[i] && j < i) || (j > i && a[j] < a[i])) {
						arr[j] = true;
						t = ((j - i) / ((a[i] - a[j]) * 1.0));
						for (k = 0; k < n; k++) {
							if (k < j && arr[k] == false && a[k] > a[j] && ((k - j) / ((a[j] - a[k]) * 1.0) > t))
								arr[k] = true;
							else if (k > j && arr[k] == false && a[k] < a[j] && ((k - j) / ((a[j] - a[k]) * 1.0) > t))
								arr[k] = true;
						}
					}
				}
				int ctr = 0;
				for (int m = 0; m < n; m++) {
					if (arr[m] == true)
						ctr++;
				}
				b[op++] = ctr;
				System.out.print(ctr+" ");
			}
			System.out.println();
			int min = Integer.MAX_VALUE;
			int max = -1;
			for (i = 0; i < op; i++) {
				if (b[i] < min)
					min = b[i];
				if (b[i] > max)
					max = b[i];
			}
			System.out.println(min + " " + max);
		}
	}
}