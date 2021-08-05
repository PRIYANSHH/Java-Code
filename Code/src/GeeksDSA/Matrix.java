package GeeksDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Matrix {
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
			int n = sc.nextInt();
			int m = sc.nextInt();
			int i, j, k;
			int a[][] = new int[n][m];
			int b[][] = new int[n][m];
			String str = "";
			for (i = 0; i < n; i++) {
				str = sc.next();
				for (j = 0; j < m; j++)
					a[i][j] = str.charAt(i) - '0';
			}

			int q = sc.nextInt();
			for (k = 0; k < q; k++) {
				int x1 = (sc.nextInt() - 1);
				int y1 = (sc.nextInt() - 1);
				int x2 = (sc.nextInt() - 1);
				int y2 = (sc.nextInt() - 1);
				b[x1][y1]++;
				if (x2 + 1 < n && y2 + 1 < m)
					b[x2 + 1][y2 + 1]++;
				if (x2 + 1 < n)
					b[x2 + 1][y1]--;
				if (y2 + 1 < m)
					b[x1][y2 + 1]--;
			}
			for (i = 0; i < m; i++) {
				for (j = 1; j < n; j++) {
					b[j][i] += b[j - 1][i];
				}
			}
			for (i = 0; i < n; i++) {
				for (j = 1; j < m; j++) {
					b[i][j] += b[i][j - 1];
				}
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if ((b[i][j] & 1) == 1) {
						if (a[i][j] == 1)
							System.out.print("0");
						else
							System.out.print("1");
					} else
						System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}
}
