package Codechef;

import java.util.*;

public class tom {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i;
			long n = sc.nextLong();
			long m = 0;
			if ((n & 1) == 1) {
				m = n / 2;
			} else {
				while ((n & 1) == 0) {
					n = n / 2;
				}
				m = n / 2;
			}
			System.out.println(m);
		}
	}
}