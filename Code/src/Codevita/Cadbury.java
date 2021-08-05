package Codevita;

import java.util.*;

public class Cadbury {
	private static int cad(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (min == 0)
			return 0;
		if (min == 1)
			return a * b;
		int st = max / min;
		int d = max % min;
		st += cad(d, min);
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minl = sc.nextInt();
		int maxl = sc.nextInt();
		int minw = sc.nextInt();
		int maxw = sc.nextInt();
		int i, j, c = 0, sum = 0;
		for (i = minl; i <= maxl; i++) {
			for (j = minw; j <= maxw; j++) {
				sum += cad(i, j);
			}
		}
		System.out.println(sum);

	}

}
