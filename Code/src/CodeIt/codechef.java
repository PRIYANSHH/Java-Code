package CodeIt;

import java.io.*;

class codechef {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int i, x, n, j, k;
		long t, t1, sum;
		x = Integer.parseInt(d.readLine());
		if (x <= 50) {
			for (k = 0; k < x; k++) {
				sum = 0;
				n = Integer.parseInt(d.readLine());
				String s1[] = new String[n];
				String s2[] = new String[n];
				String s = d.readLine();
				String se = d.readLine();
				long a[] = new long[n];
				long b[] = new long[n];
				s1 = s.split(" ");
				s2 = se.split(" ");
				for (i = 0; i < n; i++)
					a[i] = Long.parseLong(s1[i]);
				for (i = 0; i < n; i++)
					b[i] = Long.parseLong(s2[i]);
				for (i = 0; i < n - 1; i++) {
					for (j = 0; j < n - 1 - i; j++) {
						if (a[j] > a[j + 1]) {
							t = a[j];
							a[j] = a[j + 1];
							a[j + 1] = t;
						}
						if (b[j] > b[j + 1]) {
							t1 = b[j];
							b[j] = b[j + 1];
							b[j + 1] = t1;
						}
					}
				}
				for (i = 0; i < n; i++) {
					if (a[i] > b[i])
						sum = sum + b[i];
					else
						sum = sum + a[i];
				}
				System.out.println(sum);
			}
		}

	}
}
