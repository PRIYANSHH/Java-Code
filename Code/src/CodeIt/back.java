package CodeIt;

import java.io.*;

class back {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int i, j, n, m, sum, max, c, b;
		float avg;
		String s;
		// System.out.println("Enter the number of test cases:");
		m = Integer.parseInt(d.readLine());
		for (j = 0; j < m; j++) {
			c = 0;
			max = 0;
			sum = 0;
			// System.out.println("Enter the no of students:");
			n = Integer.parseInt(d.readLine());
			int a[] = new int[n];
			String s1[] = new String[n];

			// System.out.println("Enter the marks:");
			s = d.readLine();
			s1 = s.split(" ");
			for (i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s1[i]);
				if (a[i] < 31)
					c++;
				else
					sum = sum + a[i];
				if (a[i] > max) {
					max = a[i];
				}
			}
			avg = (float) sum / n;
			System.out.print(c + " ");
			System.out.printf("%.2f\n", avg);
			for (i = n - 1; i >= 0; i--) {
				if (a[i] == max)
					System.out.print(i + " ");
			}
			System.out.println();
			for (i = 0; i < n; i++) {
				b = max - a[i];
				System.out.println(b);
			}
		}
	}
}