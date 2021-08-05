package Codechef;

import java.util.*;

public class ChefinaSwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			long n = sc.nextLong();
			if ((((n * (n + 1)) / 2) & 1) == 0) {
				long ctr = 0;
				long total = (n * (n + 1)) / 2;
				double p = (Math.sqrt((4 * total) + 1) - 1) / 2;
				long i = (long) p;
				if (p == i) {
					ctr += ((i * (i - 1)) / 2) + (((n - i) * (n - i - 1)) / 2);
				}
				System.out.println(ctr + (n - i));
			} else
				System.out.println("0");
		}
	}
}