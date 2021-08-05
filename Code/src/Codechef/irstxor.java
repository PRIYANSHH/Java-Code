package Codechef;

import java.util.*;

public class irstxor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int c = sc.nextInt();
			long p = (long) (Math.log(c) / Math.log(2));
			long res1 = (long) Math.pow(2, p);
			long res2 = (long) Math.pow(2, p + 1);
			long a = res1 - 1;
			long b = res2 - (c - res1 + 1);
			System.out.println(a * b);
		}

	}

}
