package Codechef;

import java.util.*;

public class knapsack01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int questions = sc.nextInt();
			int time = sc.nextInt();
			int q[] = new int[questions];
			int t[] = new int[questions];
			int i, j;
			for (i = 0; i < questions; i++) {
				q[i] = sc.nextInt();
				t[i] = sc.nextInt();
			}
			int dp[][] = new int[questions + 1][time + 1];
			for (i = 1; i <= questions; i++) {
				for (j = 1; j <= time; j++) {
					
				}
			}
		}

	}

}
