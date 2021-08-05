package Codevita;

import java.util.*;

public class PrimeHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = a / b;
			int i, j, k = 0;
			int ch[] = new int[a];
			for (i = 2; i <= a; i++) {
				int ctr = 0;
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						ctr++;
						break;
					}
				}
				if (ctr == 0)
					ch[k++] = i;
			}
			for (i = 0; i < k; i++)
				System.out.print(ch[i] + " ");
			System.out.println();
			int ctr = 0, count = 0;
			for (i = 0; i < k; i++) {
				int p = ch[i] + d;
				if (ch[i] + d > ch[k - 1])
					break;
				else {
					for (j = 0; j < d - 1; j++) {
						for (int m = 0; m < k; m++) {
							if (p == ch[m]) {
								ctr++;
							}
						}
						p = p + d;
					}
					if (ctr == b - 1)
						count++;
					ctr = 0;
				}
			}
			System.out.println(count);
		}

	}

}
