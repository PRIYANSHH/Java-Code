package CodeIt;

import java.io.*;

class SJF {
	public static void main(String args[]) throws IOException {
		DataInputStream de = new DataInputStream(System.in);
		int i, j, n, t = 0, t1 = 0, p, sum = 0, sum1 = 0;
		float avg, avg1;
		System.out.println("Enter the no. of Process:");
		n = Integer.parseInt(de.readLine());
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int d[] = new int[n];
		int e[] = new int[n];
		System.out.println("Enter the arrival time:");
		for (i = 0; i < n; i++)
			a[i] = Integer.parseInt(de.readLine());
		System.out.println("Enter the Burst Time:");
		for (i = 0; i < n; i++)
			b[i] = Integer.parseInt(de.readLine());
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t1 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t1;
				}
			}
		}
		for (i = 1; i < n; i++) {
			for (j = 1; j < n - i; j++) {
				if (b[j] > b[j + 1]) {
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					t1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t1;
				}
			}
		}
		p = b[0];
		c[0] = p;
		for (i = 1; i < n; i++) {
			c[i] = p + b[i];
			p = c[i];
		}
		for (i = 0; i < n; i++) {
			d[i] = c[i] - a[i];
			sum += d[i];
			e[i] = d[i] - b[i];
			sum1 += e[i];
		}
		avg = (float) sum / n;
		avg1 = (float) sum1 / n;
		System.out.println("Average Turn around time is: " + avg);
		System.out.println("Average Wait time is: " + avg1);
	}
}