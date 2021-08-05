package CodeIt;

import java.util.*;

class sel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, i, s, j;
		t = sc.nextInt();
		while (t-- > 0) {
			s = 0;
			n = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			for (i = n - 1; i >= 0; i--) {
				s += a[i];
				for (j = i; j >= 0; j--) {
					if (a[j] == 0)
						a[j] = 0;
					else
						a[j] = a[j] - 1;
				}
			}
			System.out.println(s);
		}
	}
}