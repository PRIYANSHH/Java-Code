package CodeIt;

import java.io.*;

class Slution {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int a[] = new int[50];
		int b[] = new int[50];
		int n[] = new int[15];
		int q = Integer.parseInt(d.readLine());
		int i, j, p;
		for (i = 0; i < q; i++) {
			a[i] = Integer.parseInt(d.readLine());
			b[i] = Integer.parseInt(d.readLine());
			n[i] = Integer.parseInt(d.readLine());
		}
		for (i = 0; i < q; i++) {
			p = a[i];
			for (j = 0; j < n[i]; j++) {
				int t = (int) Math.pow(2, j);

				p = p + (t * b[i]);
				System.out.print(p + " ");

			}
			System.out.println();

		}
	}
}