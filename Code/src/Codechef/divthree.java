package Codechef;

import java.util.*;

public class divthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int d = sc.nextInt();
			int a[] = new int[n];
			int i;
			long sum = 0;
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			long div = sum / k;
			if (div > d)
				System.out.println(d);
			else
				System.out.println(div);

		}

	}

}
