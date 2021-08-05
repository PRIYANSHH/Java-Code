package CodeIt;

import java.util.*;

class unit {
	public static void main(String args[]) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int n;
			n = sc.nextInt();
			if (n == 1)
				System.out.println(n);
			else
				System.out.println(n / 2);
			if (n % 2 == 0) {
				if (n > 2) {
					for (int i = 1; i < n; i++) {
						System.out.print("2 ");
						System.out.println(i + " " + (i + 1) + " ");
						i++;
					}
				} else if (n == 2) {
					System.out.print("2 ");
					System.out.println("1 2");
				} else {
					if (n > 2) {
						System.out.print("3 ");
						System.out.print("1 2 " + n);
						System.out.println();
						for (int i = 3; i < n; i++) {
							System.out.print("2 ");
							System.out.println(i + " " + (i + 1) + " ");
							i++;

						}
					} else
						System.out.println("1 1");
				}
			}
		}
	}
}
