package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class KMP {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int test = sc.nextInt();
		while (test-- > 0) {
			int i, j, flag = 0;
			String s = sc.next();
			String p = sc.next();
			int l1 = s.length();
			int l2 = p.length();
			int freq1[] = new int[26];
			int freq2[] = new int[26];
			if (l1 == l2)
				System.out.println(p);
			else {
				for (i = 0; i < l1; i++) {
					freq1[s.charAt(i) - 'a']++;
				}
				for (i = 0; i < l2; i++) {
					freq2[p.charAt(i) - 'a']++;
				}
				for (i = 0; i < 26; i++) {
					freq1[i] = freq1[i] - freq2[i];
				}
				StringBuilder sb = new StringBuilder();
				for (i = 0; i < 26; i++) {
					if (freq1[i] > 0) {
						int ps = freq1[i];
						for (j = 0; j < ps; j++) {
							sb.append((char) (i + 97));
						}
					}
				}
				String str = sb.toString();
				int len = str.length();
				StringBuilder str1 = new StringBuilder();
				StringBuilder str2 = new StringBuilder();
				StringBuilder str4 = new StringBuilder();
				StringBuilder str6 = new StringBuilder();
				str1.append(str.substring(0, len)).append(p);
				str2.append(str.substring(0, len - 1)).append(p).append(str.substring(len - 1));
				if ((str2.toString()).compareTo(str1.toString()) >= 0) {
					flag = 1;
					str4.append(str1);
				} else {
					if (l1 <= 1000) {
						str4.append(str2);
						for (i = len - 2; i >= 0; i--) {
							str1.setLength(0);
							str1.append(str4);
							str4.setLength(0);
							str4.append(str.substring(0, i)).append(p).append(str.substring(i, len));
							if ((str4.toString()).compareTo(str1.toString()) < 0) {
								continue;
							} else if ((str4.toString()).compareTo(str1.toString()) >= 0) {
								flag = 3;
								break;
							}
						}
					} else {
						int l = 0, r = len;
						while (l <= r) {
							i = (l + r) / 2;
							str1.setLength(0);
							str1.append(str.substring(0, r)).append(p).append(str.substring(r));
							str6.setLength(0);
							str6.append(str.substring(0, l)).append(p).append(str.substring(l, len));
							str4.setLength(0);
							str4.append(str.substring(0, i)).append(p).append(str.substring(i, len));
							if ((str4.toString()).compareTo(str1.toString()) > 0) {
								l = i + 1;
							} else if ((str4.toString()).compareTo(str1.toString()) < 0) {
								r = i;
							} else
								break;
						}
					}
				}
				StringBuilder str5 = new StringBuilder();
				str5.append(p).append(str.substring(0, len));
				if ((str5.toString()).compareTo(str1.toString()) < 0)
					flag = 2;
				if (flag == 3)
					System.out.println(str1);
				else if (flag == 2)
					System.out.println(str5);
				else if (((str4.toString()).compareTo(str1.toString()) < 0) || flag == 1)
					System.out.println(str4);
				else
					System.out.println(str1);
			}
		}
	}
}