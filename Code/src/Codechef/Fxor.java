package Codechef;

import java.util.*;

public class Fxor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			long res = 0;
			int i;
			System.out.println("1 " + (int) Math.pow(2, 20));
			System.out.flush();
			long total = sc.nextLong();
			total -= (n * ((long) Math.pow(2, 20)));
			if ((total & 1) == 1)
				res += 1;
			for (i = 1; i <= 19; i++) {
				int k = (int) (Math.pow(2, i));
				System.out.println("1 " + k);
				System.out.flush();
				long xor = sc.nextLong();
				long diff = Math.abs(total - xor) / k;
				long one;
				if (xor >= total)
					one = (n - diff) / 2;
				else
					one = (n + diff) / 2;
				if ((one & 1) == 1)
					res += k;
			}
			System.out.println("2 " + res);
			System.out.flush();
			long out = sc.nextLong();
			if (out == -1)
				System.exit(-1);
		}
	}
}