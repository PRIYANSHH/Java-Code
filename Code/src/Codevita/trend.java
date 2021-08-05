package Codevita;

import java.util.*;

public class trend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		int p, q;
		double a[] = new double[n];
		double b[] = new double[n];
		double bc[] = new double[n];
		int i, g = 0;
		for (i = 0; i < n; i++)
			a[i] = sc.nextDouble();
		if (x > y) {
			p = x;
			q = y;
		} else {
			p = y;
			q = x;
		}
		double sum = 0, sum2 = 0;
		for (int j = 0; j < p; j++) {
			sum += a[j];
		}
		for (int j = (p - q); j < p; j++) {
			sum2 += a[j];
		}
		int hh = 0;
		double t = a[hh++];
		int hp = (p - q);
		double t2 = a[hp++];
		int g2 = 0;
		b[g++] = (double) sum / p;
		bc[g2++] = (double) sum2 / q;
		for (int j = p; j < n; j++) {
			sum = sum - t;
			sum += a[j];
			b[g++] = (double) sum / p;
			t = a[hh++];
			sum2 = sum2 - t2;
			sum2 += a[j];
			bc[g2++] = (double) sum2 / q;
			t2 = a[hp++];
		}
		int ctr = 0;
		for (i = 0; i < g - 1; i++) {
			if (bc[i] > b[i] && bc[i + 1] < b[i + 1]) {
				ctr++;
			}
			if (bc[i] < b[i] && bc[i + 1] > b[i + 1]) {
				ctr++;
			}
		}
		System.out.print(ctr);
	}
}
