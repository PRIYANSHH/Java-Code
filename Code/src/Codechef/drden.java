package Codechef;

import java.util.*;

public class drden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, max = 0, res = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			i = 0;
			while (i < n - 1) {
				if (a[i] == a[i + 1]) {
					a[i + 1] = 0;
					i += 2;
				} else
					i++;
			}
			for (i = 0; i < n; i++) {
				if (a[i] != 0)
					b[a[i]]++;
			}
			for (i = 0; i < n; i++) {
				if (b[i] > max) {
					max = b[i];
					res = i;
				}
			}
			System.out.println(res);
		}
	}
}
