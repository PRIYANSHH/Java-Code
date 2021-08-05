package CodeIt;

import java.util.*;

class stamps {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, s = 0, s1 = 0;
		;
		n = sc.nextInt();
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			s += (i + 1);
			s1 += a[i];
		}
		if (s1 >= s)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
