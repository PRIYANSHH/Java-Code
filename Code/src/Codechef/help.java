package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class help {
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

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		int test = sc.nextInt();
		while (test-- > 0) {
			int sum = 0;
			int i, j, h = 0, t;
			String t2;
			long t1;
			int n = sc.nextInt();
			String a[] = new String[n];
			long b[] = new long[n];
			int c[] = new int[n];
			String d[] = new String[n];
			long e[] = new long[n];
			int f[] = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = sc.next();
				b[i] = sc.nextLong();
				c[i] = sc.nextInt();
				sum += c[i];
			}
			double avg =(double)sum / n;
			System.out.println(avg);
			for (i = 0; i < n; i++) {
				if (c[i] < avg) {
					f[h] = c[i];
					e[h] = b[i];
					d[h] = a[i];
					h++;
				}
			}
			for (i = 0; i < h - 1; i++) {
				for (j = 0; j < h - 1 - i; j++) {
					if (f[j] > f[j + 1]) {
						t = f[j];
						f[j] = f[j + 1];
						f[j + 1] = t;
						t1 = e[j];
						e[j] = e[j + 1];
						e[j + 1] = t1;
						t2 = d[j];
						d[j] = d[j + 1];
						d[j + 1] = t2;
					}
				}
			}
			for (i = 0; i < h; i++)
				System.out.println(d[i] + " " + e[i] + " " + f[i]);
		}
	}

}
