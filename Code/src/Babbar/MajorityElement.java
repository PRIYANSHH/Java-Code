package Babbar;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int majority = a[0];
			int count = 1;
			for (i = 1; i < n; i++) {
				if (a[i] == majority)
					count++;
				else
					count--;
				if (count == 0) {
					majority = a[i];
					count = 1;
				}
			}
			int ctr = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == majority)
					ctr++;
			}
			if (ctr > (n / 2))
				System.out.println("Majority exists: " + majority + " (" + ctr + " times).");
			else
				System.out.println("Majority does not exist");
		}

	}

}
