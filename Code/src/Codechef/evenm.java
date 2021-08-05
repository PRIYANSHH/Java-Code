package Codechef;

import java.util.*;

public class evenm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i, j, l = 0, p = 0, k = 1;
			int n = sc.nextInt();
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if ((i & 1) == 0) {
						if (j != (n - 1))
							System.out.print(k + " ");
						else
							System.out.print(k);
						k++;
						l = k + (n - 1);
						p = l;
					} else {
						if (j != (n - 1))
							System.out.print(p + " ");
						else
							System.out.print(p);
						p--;
					}
				}
				System.out.println();
				k = l + 1;
			}
		}
	}
}
