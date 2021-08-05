package Codevita;

import java.util.*;

public class graph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int q = m;
		int n = sc.nextInt();
		int i, ctr1 = 0, ctr2 = 0, flag = 0, p;
		if (m == n)
			System.out.print("0");
		else {
			for (i = m - 1; i > 0; i--) {
				if (m % i == 0) {
					ctr1++;
					m = i;
					if (m == n) {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0) {
				for (i = n - 1; i > 0; i--) {
					if (n % i == 0) {
						ctr2++;
						n = i;
						if (n == q) {
							flag = 2;
							break;
						}
					}
				}
			}
			if (flag == 2)
				System.out.print(ctr2);
			else if (flag == 1)
				System.out.print(ctr1);
			else
				System.out.print(ctr1 + ctr2);
		}
	}

}
