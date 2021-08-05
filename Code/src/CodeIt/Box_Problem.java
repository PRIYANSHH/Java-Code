package CodeIt;

import java.io.*;

class Box_Problem {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int n, r, c, flag = 1, j, i = 0;
		int a[][] = new int[2][5];
		do {
			System.out.println("Enter the row and column:");
			r = Integer.parseInt(d.readLine());
			c = Integer.parseInt(d.readLine());
			n = Integer.parseInt(d.readLine());
			a[r][c] = 2;
		} while (n == 1);
		System.out.println("Path:");
		for (j = 1; j < 5; j++) {
			if (a[i][j] == 2) {
				if ((a[1][j] == 2) || (a[1][j - 1] == 2) || (a[1][j + 1] == 2)) {
					flag = 0;
					break;
				} else {
					flag = 1;
					if (i == 0) {
						i = 1;
						j--;
					} else {
						i = 0;
						j--;
					}

				}
			}

			System.out.print("(" + i + "," + j + ")->");
		}
		if (flag == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}