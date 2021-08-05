package GeeksDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class stackk {
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
			int a, b, c, d, x, y, q, ctr1 = 0, ctr2 = 0, ctr3 = 0, ctr4 = 0;
			String s = sc.next();
			x = sc.nextInt();
			y = sc.nextInt();
			q = sc.nextInt();
			int i, j, k;
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'R')
					ctr1++;
				if (s.charAt(i) == 'L')
					ctr2++;
				if (s.charAt(i) == 'U')
					ctr3++;
				if (s.charAt(i) == 'D')
					ctr4++;
			}
			StringBuilder sb = new StringBuilder();
			for (i = 0; i < q; i++) {
				int flag1 = 0, flag = 0, flag2 = 0;
				a = sc.nextInt();
				b = sc.nextInt();
				c = Math.abs(x - a);
				d = Math.abs(y - b);
				int ss = c + d;
				if (a > x) {
					flag1 = 1;
				} else {
					flag1 = 2;
				}
				if (b > y) {
					flag2 = 1;
				} else {
					flag2 = 2;
				}
				if ((flag1 == 1 && c <= ctr1) || (flag1 == 2 && c <= ctr2)) {
					if ((flag2 == 1 && d <= ctr3) || (flag2 == 2 && d <= ctr4)) {
						flag = -1;
					}
				}

				if (flag == -1)
					sb.append("YES ").append(ss);
				else
					sb.append("NO");
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}

	}

}
