package HackerRank;

import java.util.*;

public class JazzyAndBalls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		long result = 0;
		for (i = 0; i < n; i++) {
			long b = sc.nextLong();
			result += b;
			while ((b & 1) == 0) {
				b >>= 1;
				result += b;
			}
			for (long j = 3; j <= Math.sqrt(b); j += 2)
				while (b % j == 0) {
					b /= j;
					result += b;
				}
			if (b > 2)
				result++;
		}
		System.out.println(result);
	}
}
