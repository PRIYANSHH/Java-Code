package CodeIt;

import java.io.*;

class Sufiland {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int i, j, k = 0, l = 0, f, c, n, v = 0, max = 0, t = 0;
		System.out.println("Enter n:");
		n = Integer.parseInt(d.readLine());
		String s1[] = new String[n];
		int a[] = new int[n + 1];
		int b[] = new int[n];
		int w[] = new int[n];
		String s = d.readLine();
		s1 = s.split(" ");
		for (i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s1[i]);
		}
		for (i = 0; i < n; i++) {
			c = 0;
			f = 0;
			for (j = i; j >= 0; j--) {

				if ((a[i] - a[j] >= 0) && (a[j + 1] >= a[j])) {

					c++;
					if (a[j] == a[0])
						c = 1;

				}

				else
					break;

			}

			System.out.println(c);
			b[k++] = c;
			for (j = i + 1; j < n; j++) {
				if ((a[i] - a[j] >= 0) && (a[j] >= a[j + 1]))
					f++;
				else
					break;
			}

			w[l++] = f;
		}
		for (i = 0; i < n; i++) {
			v = b[i] + w[i];

			if (v >= max)
				max = v;
		}
		System.out.println(max);
	}
}
