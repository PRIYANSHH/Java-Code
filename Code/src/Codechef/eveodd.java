package Codechef;

import java.util.*;

public class eveodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			long r = sc.nextLong();
			long c = sc.nextLong();
			long e = 0, o = 0;
			if (c >= r) {
				long s = r / 2;
				if ((r & 1) == 0)
					o += s * s;
				else
					o += (s + 1) * (s + 1);
				e += s * (s + 1);
			} else {
				long s = c / 2;
				if ((c & 1) == 0)
					o += s * s;
				else
					o += (s + 1) * (s + 1);
				e += s * (s + 1);
				long diff = r - c;
				if ((c & 1) == 0) {
					if (((diff) & 1) == 0) {
						e += (diff * c) / 2;
						o += (diff * c) / 2;
					} else {
						o += ((diff + 1) / 2) * c;
						e += ((diff - 1) / 2) * c;
					}
				} else {
					if (((diff) & 1) == 0) {
						e += (diff * c) / 2;
						o += (diff * c) / 2;
					} else {
						o += ((diff - 1) / 2) * c;
						e += ((diff + 1) / 2) * c;
					}
				}
			}
			System.out.println(e + " " + o);
		}
	}

}
