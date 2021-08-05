package Codechef;

import java.util.*;

public class chess {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int k = sc.nextInt();
			int i, j, s = 0;
			System.out.print("O");
			for (i = 0; i < 8; i++) {
				if (i == 0) {
					for (j = 1; j < 8; j++) {
						if (k > 1)
							System.out.print(".");
						else {
							s++;
							if (s > 31)
								System.out.print(".");
							else
								System.out.print("X");
						}
						k--;
					}
				} else {
					for (j = 0; j < 8; j++) {
						if (k > 1)
							System.out.print(".");
						else {
							s++;
							if (s > 31)
								System.out.print(".");
							else
								System.out.print("X");
						}
						k--;
					}
				}
				System.out.println();
			}
		}
	}
}
