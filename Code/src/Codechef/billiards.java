package Codechef;

import java.util.*;

public class billiards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int a[] = new int[round];
		int b[] = new int[round];
		int p, q, sum1 = 0, sum2 = 0, sum = 0;
		for (int i = 0; i < round; i++) {
			p = sc.nextInt();
			sum1 += p;
			q = sc.nextInt();
			sum2 += q;
			sum = sum1 - sum2;
			if (sum1 > sum2) {
				a[i] = sum;
				b[i] = 0;
			} else {
				b[i] = Math.abs(sum);
				a[i] = 0;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		if (a[round - 1] > b[round - 1])
			System.out.println("1 " + a[round - 1]);
		else
			System.out.println("2 " + b[round - 1]);
	}
}
