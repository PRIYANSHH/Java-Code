package CodeIt;

import java.io.*;

class CPU_Scheduling {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int i, j, n, t, t2, s1 = 0, s2 = 0;
		double avg1 = 0, avg2 = 0;
		System.out.println("Enter the limit:");
		n = Integer.parseInt(d.readLine());
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int de[] = new int[n];
		int e[] = new int[n];
		System.out.println("Enter the Arrival Time:");
		for (i = 0; i < n; i++) {
			a[i] = Integer.parseInt(d.readLine());
		}
		System.out.println("Enter the Burst Time:");
		for (i = 0; i < n; i++) {
			b[i] = Integer.parseInt(d.readLine());
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t2 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t2;
				}
			}
		}
		System.out.println("Arrival time:");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Burst time:");
		for (i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Completion Time:");
		for (i = 1; i < n; i++) {
			c[0] = b[0];
			c[i] = b[i] + c[i - 1];
		}
		for (i = 0; i < n; i++) {
			System.out.println(c[i] + " ");
		}
		System.out.println("Turn around time:");
		for (i = 0; i < n; i++) {
			de[i] = c[i] - a[i];
			System.out.println(de[i] + " ");
			s1 = s1 + de[i];
		}
		avg1 = (double) s1 / n;
		System.out.println("Average Turn around time:" + avg1);
		System.out.println("Wait Time:");
		for (i = 0; i < n; i++) {
			e[i] = de[i] - b[i];
			System.out.println(e[i] + " ");
			s2 = s2 + e[i];
		}
		avg2 = (double) s2 / n;
		System.out.println("Average Wait time:" + avg2);
	}
}