package Babbar;

import java.util.*;

public class MinumJumpsPossible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			if (a[0] == 0)
				System.out.println("Not Reachable");
			else {
				int reachable = 0;
				for (i = 0; i < n; i++) {
					if (reachable < i)
						break;
					else
						reachable = Math.max(reachable, i + a[i]);
				}
				if (reachable >= n - 1)
					System.out.println("Reachable " + reachable);
				else
					System.out.println("Not Reachable " + reachable);
			}
		}

	}

}
