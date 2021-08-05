package CodeIt;

import java.io.*;

class Birthday {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int n, i, j, t = 0, c = 0, max = 0;
		System.out.println("Enter the n:");
		n = Integer.parseInt(d.readLine());
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = Integer.parseInt(d.readLine());
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = n - 1; i >= 0; i--) {
			max = a[n - 1];
			if (a[i] == max) {
				c++;
			}
		}
		System.out.println("Maximum element is: " + max + ". It occurs " + c + " times.");
	}
}
