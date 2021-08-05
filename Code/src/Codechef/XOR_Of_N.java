package Codechef;

import java.util.*;

public class XOR_Of_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {

			// XOR of all natural numbers from 1 to n: efficient method
			long n = sc.nextLong();
			long c = 0;
			if (n % 4 == 0)
				c = n;
			else if (n % 4 == 1)
				c = 1;
			else if (n % 4 == 2)
				c = n + 1;
			else
				c = 0;
			System.out.println("XOR of 1 to n : " + c);
		}
	}
}