package Codechef;

import java.util.*;

public class xystr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, k = 0, flag = 0, u, z = 0;
		double ctr = 0.0;
		String s = "";
		String a[] = { "ACov(A)", "BCov(B)", "CCov(C)", "DCov(D)", "ECov(E)", "FCov(F)" };
		String b[] = { "ACov", "BCov", "CCov", "DCov", "ECov", "FCov" };
		String c[] = { "(A)", "(B)", "(C)", "(D)", "(E)", "(F)" };
		String d[] = new String[18];
		for (u = 0; u < 6; u++) {
			flag = 0;
			int as = 0;
			s = sc.next();
			for (i = 0; i < 6; i++) {
				if (s.equals(a[i])) {
					flag = 1;
					for (z = 0; z < k; z++) {
						if (d[z].equals(a[i])) {
							as = 2;
							break;
						}
					}
					if (as != 2) {
						d[k++] = a[i];
						ctr++;
					}
					break;
				}
			}
			if (flag == 0) {
				as = 0;
				if (s.length() >= 4) {
					for (i = 0; i < 6; i++) {
						if ((s.substring(0, 4)).equals(b[i])) {
							for (z = 0; z < k; z++) {
								if (d[z].equals(b[i])) {
									as = 2;
									break;
								}
							}
							if (as != 2) {
								d[k++] = b[i];
								ctr += 0.5;
							}
							break;
						}
					}
				}
				int len = s.length();
				if (len >= 3) {
					as = 0;
					for (i = 0; i < 6; i++) {
						if ((s.substring(len - 3, len)).equals(c[i])) {
							for (z = 0; z < k; z++) {
								if (d[z].equals(c[i])) {
									as = 2;
									break;
								}
							}
							if (as != 2) {
								d[k++] = c[i];
								ctr += 0.5;
							}
							break;
						}
					}
				}
			}
		}
		System.out.println(ctr);
	}
}
