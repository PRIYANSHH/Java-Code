package Codechef;

import java.util.*;

public class replesx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int p = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			if (p == k) {
				int f = 0;
				if (a[p - 1] == x)
					System.out.println("0");
				else if (x < a[p-1]) {
					for (i = p - 2; i >= 0; i--) {
						if (a[i] > x)
							f++;
						else {
							f++;
							break;
						}
					}
					if (f == 0)
						System.out.println("1");
					else
						System.out.println(f);
				} else {
					for (i = p - 1; i < n; i++) {
						if (a[i] < x)
							f++;
						else
							break;
					}
					if (f == 0)
						System.out.println("1");
					else
						System.out.println(f);
				}
			} else if (p < k) {
				int f = 0;
				if (a[p - 1] < x)
					System.out.println("-1");
				else if (a[p - 1] == x)
					System.out.println("0");
				else {
					for (i = 0; i < n; i++) {
						if (a[i] <= x)
							f++;
						else
							break;
					}
					System.out.println(p - f);
				}

			} else if (p > k) {
				int f = 0;
				if (a[p - 1] > x)
					System.out.println("-1");
				else if (a[p - 1] == x)
					System.out.println("0");
				else {
					for (i = p - 1; i < n; i++) {
						if (a[i] < x)
							f++;
						else
							break;
					}
					System.out.println(f);
				}

			}
		}

	}

}
