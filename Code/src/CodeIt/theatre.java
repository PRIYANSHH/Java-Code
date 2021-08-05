package CodeIt;

import java.util.*;
import java.io.*;

class theatre {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		Scanner sc = new Scanner(System.in);
		int n, i, j, t, y, p1, v1, v2, ch, g, max, sum, sum1 = 0, i1, i2, a1 = 0, a2 = 0, f;
		String as = "   ", num;
		int c[] = { 100, 75, 50, 25 };
		int a[][] = new int[4][4];
		t = sc.nextInt();
		for (i = 0; i < t; i++) {
			sum = 0;
			for (v1 = 0; v1 < 4; v1++) {
				for (v2 = 0; v2 < 4; v2++)
					a[v1][v2] = 0;
			}
			n = sc.nextInt();
			for (j = 0; j < n; j++) {
				as = d.readLine();
				num = as.substring(2);
				ch = (int) as.charAt(0);
				y = ch - 65;
				p1 = Integer.parseInt(num);
				if (p1 == 12) {

					a[y][0] += 1;
				} else if (p1 == 3) {

					a[y][1] += 1;
				} else if (p1 == 6) {

					a[y][2] += 1;
				} else if (p1 == 9) {

					a[y][3] += 1;
				}
			}
			max = 0;
			f = 0;
			for (g = 0; g < 4; g++) {
				for (i1 = 0; i1 < 4; i1++) {
					for (i2 = 0; i2 < 4; i2++) {
						if (i1 == a1 || i2 == a2) {
							f += 100;
							break;
						}
						if (a[i1][i2] > max) {
							max = a[i1][i2];
							a1 = i1;
							a2 = i2;
						}
					}
				}
				a[a1][a2] = 0;
				sum = sum + (c[g] * max) - f;
				sum1 += sum;
			}
			System.out.println(sum);
		}
		System.out.println(sum1);
	}
}