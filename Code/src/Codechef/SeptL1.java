package Codechef;

import java.util.*;

public class SeptL1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			if ((k * l < n) || (n > 1 && k == 1))
				System.out.println("-1");
			else {
				int p = 1;
				for (int i = 0; i < n; i++) {
					if (p > k) {
						p = 1;
					}
					System.out.print(p + " ");
					p++;
				}
				System.out.println();
			}
		}

	}

}
