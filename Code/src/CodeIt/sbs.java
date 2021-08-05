package CodeIt;

import java.io.*;

class sbs {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		String s1[] = new String[100];
		String s;
		int i;
		int a[] = new int[100];
		s = d.readLine();
		s1 = s.split(" ");
		for (i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(s1[i]);

			System.out.println(a[i]);
		}
	}
}
