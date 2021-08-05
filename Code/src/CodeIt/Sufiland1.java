package CodeIt;

import java.io.*;

class Sufiland1 {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int n, i;
		System.out.println("Enter n:");
		n = Integer.parseInt(d.readLine());
		String s1[] = new String[n];
		int a[] = new int[n];
		String s = d.readLine();
		s1 = s.split(" ");
		for (i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s1[i]);
		}
	}
}