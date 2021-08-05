package Codechef;

import java.util.*;

public class NO_OF_BITS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			long n = sc.nextLong();
			long x = n;
			// Check if number is power of 2
			boolean ss = x > 0 && ((x & (x - 1)) == 0);

			// Conversion Decimal to Binary
			String r = Long.toBinaryString(n);

			// Total no of bits in number
			int p = (int) ((Math.log(n) / Math.log(2)) + 1);

			// Total no of set bits in number
			int q = Long.bitCount(n);

			// Conversion Binary to Decimal
			long h = Long.parseLong(r, 2);

			// Number after turning off last bit
			n -= (n & (-n));

			String n2 = Long.toBinaryString(n);
			String cc = ss == true ? "Yes" : "No";
			System.out.println("Is no a power of 2? : " + cc);
			System.out.println("Decimal Representation: " + h);
			System.out.println("Binary Representation: " + r);
			System.out.println("Total Bits: " + p);
			System.out.println("Total Set Bits: " + q);
			System.out.println("Number after turning off last bit: " + n);
			System.out.println("Binary representation of Number after turning off last Set bit: " + n2);
		}
	}
}
