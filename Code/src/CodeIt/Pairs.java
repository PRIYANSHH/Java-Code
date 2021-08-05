package CodeIt;

import java.io.*;

class Pairs {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int k, i, j;
		double p, q, r;
		System.out.println("Enter the value of k:");
		k = Integer.parseInt(d.readLine());
		r = 1.0 / k;
		for (i = 1; i <= 1000; i++) {
			for (j = 1; j <= 1000; j++) {
				p = 1.0 / i;
				q = 1.0 / j;
				if ((p + q) == r) {
					System.out.println("Pairs of x,y are:");
					System.out.println("(" + i + "," + j + ") ");
				}
			}
		}
	}
}