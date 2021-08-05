package Codechef;

import java.util.*;

public class xxoorr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int i, j, index;
			int a[] = new int[n];
			int sum[] = new int[32];
			String p;
			for (i = 0; i < n; i++) {
				index = 31;
				p = Integer.toBinaryString(sc.nextInt());
				for (j = p.length() - 1; j >= 0; j--) {
					if (p.charAt(j) == '1')
						sum[index]++;
					index--;
				}
			}
			int result = 0;
			for (i = 0; i < 32; i++)
				if (sum[i] <= k && sum[i] > 0)
					result++;
				else
					result += Math.ceil(sum[i] / (double) k);
			System.out.println(result);
		}
	}
}
