package Babbar;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (i = 0; i < n; i++) {
				if (a[i] > max)
					max = a[i];
				if (a[i] < min)
					min = a[i];
			}
			System.out.println("Max: " + max + " Min: " + min);
			System.out.println(
					"Max: " + Arrays.stream(a).max().getAsInt() + " Min: " + Arrays.stream(a).min().getAsInt());
		}
	}
}
