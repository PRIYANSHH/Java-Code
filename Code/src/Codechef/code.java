package Codechef;

import java.util.*;

public class code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int i, flag = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			for (i = n - 1; i > 1; i--) {
				if (((a[i - 1] + a[i - 2]) > a[i]) && ((a[i] + a[i - 1]) > a[i - 2])
						&& ((a[i - 2] + a[i]) > a[i - 1])) {
					b[0] = a[i];
					b[1] = a[i - 1];
					b[2] = a[i - 2];
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("YES");
				System.out.println(b[0] + " " + b[1] + " " + b[2]);

			} else
				System.out.println("NO");
		}

	}

}
