package CodeIt;

import java.math.BigInteger;
import java.util.*;

class BigInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, c = 0;
		BigInteger p = new BigInteger("1");
		n = sc.nextInt();
		for (i = n; i > 0; i--) {
			BigInteger p1 = new BigInteger(Integer.toString(i));
			p = p.multiply(p1);
		}
		System.out.println(p);
		String str = p.toString();
		int l = str.length();
		for (i = l - 1; i >= 0; i--) {
			if (str.charAt(i) == '0')
				c++;
			else
				break;
		}
		System.out.println(c);
	}
}