package Codevita;

import java.util.*;

public class divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, j, t = 0, flag = 0;
			;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			for (i = 0; i < n - 1; i++) {
				if ((a[i] + a[i + 1]) % 3 == 0) {
					for (j = i + 2; j < n; j++) {
						if ((a[j] + a[i]) % 3 != 0) {
							t = a[i + 1];
							a[i + 1] = a[j];
							a[j] = t;
							break;
						}
					}
				}
			}
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			for (i = n - 1; i > 0; i--) {
				if ((a[i] + a[i - 1]) % 3 == 0) {
					for (j = i - 2; j >= 0; j--) {
						if ((a[j] + a[i]) % 3 != 0) {
							t = a[i - 1];
							a[i - 1] = a[j];
							a[j] = t;
							break;
						}
					}
				}
			}
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			for (i = 0; i < n - 1; i++) {
				if ((a[i] + a[i + 1]) % 3 == 0) {
					flag = 1;
					break;
				}
			}
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			if (flag == 1)
				System.out.println("No");
			else
				System.out.println("Yes");
		}

	}

}
