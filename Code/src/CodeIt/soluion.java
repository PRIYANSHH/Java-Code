package CodeIt;

import java.io.*;

class soluion {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int N, i;
		N = Integer.parseInt(d.readLine());
		if (N >= 2 && N <= 20) {
			for (i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + (N * i));
			}

		}
	}
}