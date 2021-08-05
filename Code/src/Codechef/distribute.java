package Codechef;

import java.util.*;

public class distribute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			long prev = 1;
			long curr = 0;
			long sum = (prev + curr);
			for (int i = 2; i <= n; i++) {
				sum = ((i - 1) * (curr + prev));
				prev = curr;
				curr = sum;
			}
			if (n == 1)
				System.out.println("0");
			else
				System.out.println(sum % 1000000007);
		}

	}

}
