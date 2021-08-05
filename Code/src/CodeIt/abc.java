package CodeIt;

import java.io.*;
import java.util.StringTokenizer;

class abc {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int T, l, c, e, i, j;
		String s = "";
		char m;
		T = Integer.parseInt(d.readLine());
		if (T > 0) {
			for (i = 1; i <= T; i++) {
				l = 0;
				c = 0;
				e = 0;
				s = d.readLine();
				l = s.length();

				for (j = 0; j < l; j++) {
					m = s.charAt(j);
					if (m == '0')
						c++;
					else
						e++;
				}
				if (c == 1 || e == 1)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}
