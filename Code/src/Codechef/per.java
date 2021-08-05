package Codechef;

import java.util.*;

class per {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, c = 1, p = 0;
			int flag = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int key = a[n - 1];
			for (i = n - 1; i > 0; i--) {
				if (a[i] == key) {
					p++;
					if (p > 1) {
						flag = 1;
						break;
					}
				} else {
					break;
				}
			}
			if (flag != 1) {
				for (i = 0; i < n - 1; i++) {
					if (a[i + 1] == a[i]) {
						c++;
						if (c > 2) {
							flag = 1;
							break;
						}
					} else
						c = 1;
				}
			}
			int j = 0;
			if (flag == 0) {
				for (i = 0; i < n; i = i + 2) {
					b[j++] = a[i];
				}
				if ((n & 1) == 0) {
					for (i = n - 1; i >= 0; i = i - 2)
						b[j++] = a[i];
				} else {
					for (i = n - 2; i > 0; i = i - 2)
						b[j++] = a[i];
				}
			}
			if (flag == 1)
				System.out.println("NO");
			else {
				System.out.println("YES");
				for (i = 0; i < n; i++)
					System.out.print(b[i] + " ");
				System.out.println();
			}

		}
	}
}
