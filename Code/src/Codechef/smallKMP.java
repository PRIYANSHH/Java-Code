package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class smallKMP {
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
			int i, j, q, index = 0;
			String s = sc.next();
			String p = sc.next();
			char ch = p.charAt(0);
			char a[] = s.toCharArray();
			char b[] = p.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			int l1 = a.length;
			int l2 = b.length;
			System.out.println(l1 + " " + l2);
			/*
			 * for (i = 0; i < l2; i++) { for (j = 0; j < l1; j++) { if (b[i] == a[j]) {
			 * a[j] = 123; break; } } }
			 */
			i = 0;
			j = 0;
			while (i < l2 && j < l1) {
				if (b[i] == a[j]) {
					a[j] = 123;
					i++;
					j = 0;
				} else if (b[i] != a[j]) {
					j++;
				}
				if (i < l2 && j == l1) {
					j = 0;
					i++;
				}
			}
			for (i = l1 - 1; i >= 0; i--) {
				if (a[i] <= ch) {
					index = i;
					break;
				}
			}
			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for (i = 0; i < l1; i++) {
				if (a[i] != 123 && i <= index) {
					sb.append(a[i]);
				} else if (a[i] != 123 && i > index) {
					sb2.append(a[i]);
				}

			}
			if(sb2.toString().length()==0) {
				
			}
			String str = sb.toString() + p + sb2.toString();
			int l3=str.length();
		}

	}

}
