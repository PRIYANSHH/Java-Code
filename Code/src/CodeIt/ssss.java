package CodeIt;

import java.util.*;

class ssss {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t;
		long a, b, c, i;
		String s1, s2, s3, str;
		t = sc.nextInt();
		while (t-- > 0) {
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			s1 = Long.toString(a);
			s2 = Long.toString(b);
			s3 = Long.toString(c);
			for (i = c; i >= 0; i--) {
				str = Long.toString(i);
				int len = str.length();
				long n, r = 0;
				for (int j = 0; j < len; j++) {
					n = r * 10 + (str.charAt(j) - '0');
					r = n % a;
				}
				if (r == b) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}