package CodeIt;

import java.io.*;

class tax {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int t, n, k = 0, i;
		double tax, p;
		t = Integer.parseInt(d.readLine());
		for (i = 0; i < t; i++) {
			tax = 0.0;
			p = 0.0;
			k = 0;
			n = Integer.parseInt(d.readLine());
			if (n <= 250000) {
				p = n;
				k = (int) p;
			} else if (n > 250001 && n <= 500000) {
				tax = (n - 250000) * 0.05;
				p = n - tax;
				k = (int) p;
			} else if (n > 500000 && n <= 750000) {
				tax = (n - 500000) * 0.1 + (250000 * 0.05);
				p = n - tax;
				k = (int) p;
			} else if (n > 750000 && n <= 1000000) {
				tax = (n - 750000) * 0.15 + (250000 * 0.1) + (250000 * 0.05);
				p = n - tax;
				k = (int) p;
			} else if (n > 1000000 && n <= 1250000) {
				tax = (n - 1000000) * 0.2 + (250000 * 0.1) + (250000 * 0.15) + (250000 * 0.05);
				p = n - tax;
				k = (int) p;
			} else if (n > 1250000 && n <= 1500000) {
				tax = (n - 1250000) * 0.25 + (250000 * 0.1) + (250000 * 0.15) + (250000 * 0.05) + (250000 * 0.2);
				p = n - tax;
				k = (int) p;
			} else if (n > 1500000) {
				tax = (n - 1500000) * 0.30 + (250000 * 0.1) + (250000 * 0.15) + (250000 * 0.05) + (250000 * 0.2)
						+ (250000 * 0.25);
				p = n - tax;
				k = (int) p;
			}
			System.out.println(k);
		}
	}
}