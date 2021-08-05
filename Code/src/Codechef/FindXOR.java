package Codechef;

import java.util.*;

public class FindXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int test = sc.nextInt();
		while (test-- > 0) {
			long n = sc.nextLong();
			int i;
			int num = (int) n;
			if (k == 1) {
				StringBuilder str = new StringBuilder();
				long sum = (n * (n + 1)) / 2;
				long s1 = sum / 2;
				int a[] = new int[num + 1];
				for (i = num; i > 0; i--) {
					if (s1 - i >= 0) {
						a[i]++;
						s1 -= i;
					}
				}
				if ((n * (n + 1)) % 4 == 0)
					System.out.println("0");
				else
					System.out.println("1");
				for (i = 1; i <= num; i++) {
					if (a[i] > 0) {
						str.append("1");
					} else
						str.append("0");
				}
				System.out.println(str.toString());
			} else if (k == 2) {
				StringBuilder str = new StringBuilder();
				long sum = (n * (n + 1) * (2 * n + 1)) / 6;
				long s1 = 0, s2 = 0, s3 = 0;
				s1 = (sum / 2);
				s2 = sum - s1;
				long s5, s7 = 0;
				s1 = Math.min(s1, s2);
				s5 = Math.max(s1, s2);
				int p = 0;
				int a[] = new int[num + 1];
				int b[] = new int[num + 1];
				for (i = 1; i <= num; i++) {
					if ((((long) i) * (((long) i) + 1) * (2 * ((long) i) + 1)) / 6 >= sum / 2) {
						p = i;
						break;
					}
				}
				for (i = p; i > 0; i--) {
					if (s1 - (i * i) >= 0) {
						a[i]++;
						s1 -= ((long) i * (long) i);
						s3 += ((long) i * (long) i);
					}
				}
				for (i = p + 1; i > 0; i--) {
					if (s5 - ((long) i * (long) i) >= 0) {
						b[i]++;
						s5 -= ((long) i * (long) i);
						s7 += ((long) i * (long) i);
					}
				}
				System.out.println(sum + " " + s3 + " " + s7);
				System.out.println(p);
				if (s3 > s7) {
					for (i = 1; i <= num; i++) {
						if (a[i] > 0)
							str.append("1");
						else
							str.append("0");
					}
				} else {
					for (i = 1; i <= num; i++) {
						if (b[i] > 0)
							str.append("1");
						else
							str.append("0");
					}
				}
				long cal = Math.abs(sum - (Math.max(s3, s7)));
				System.out.println(Math.abs(cal - (Math.max(s3, s7))));
				System.out.println(str.toString());
			}

		}
	}
}