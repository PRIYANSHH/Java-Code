//.....CHEF...AND..DIGITS..OF...NUMBER...
package CodeIt;

import java.util.*;
import java.math.*;
import java.io.*;

class CD {
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
			return (st.nextToken());
		}

		int nextInt() {
			return (Integer.parseInt(next()));
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return (str);
		}
	}

	public static void main(String[] args) {
		FastReader in = new FastReader();
		int T = in.nextInt();
		while (T > 0) {
			String S = in.nextLine();
			int n0 = 0;
			int n1 = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '0')
					n0++;
				else
					n1++;
			}
			if (n1 == 1 || n0 == 1)
				System.out.println("Yes");
			else
				System.out.println("No");

			T--;
		}
	}
}