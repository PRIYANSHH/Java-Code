package CodeIt;

import java.io.*;

class Lantern {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int n, i, x, c, j;
		System.out.println("Enter the n:");
		n = Integer.parseInt(d.readLine());
		int a[] = new int[n];
		System.out.println("Enter the number of inputs in array:");
		x = Integer.parseInt(d.readLine());
		c = n / x;
		j = 1;
		for (i = c; i < n; i = c * j) {
			j++;
			a[i] = Integer.parseInt(d.readLine());
		}
		System.out.println("Lantern spreads light upto " + (c - 1) + " units");
	}
}