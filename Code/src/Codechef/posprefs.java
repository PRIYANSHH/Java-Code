package Codechef;

import java.util.*;

public class posprefs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			StringBuffer sb = new StringBuffer();
			if (n == k) {
				for (int i = 1; i <= n; i++)
					sb.append(i).append(" ");
				System.out.println(sb.toString());
			} else if (k > (n / 2)) {
				int ctr = 0;
				for (int i = 1; i <= n; i++) {
					if ((i & 1) == 0 && ctr != (n - k)) {
						sb.append(0 - i).append(" ");
						ctr++;
					} else
						sb.append(i).append(" ");
				}
				System.out.println(sb.toString());
			} else if (k <= (n / 2)) {
				int diff = k, diff2 = 0;
				for (int i = 1; i <= n; i++) {
					if ((i & 1) == 0)
						sb.append(0 - i).append(" ");
					else if (diff2 != diff) {
						sb.append(i).append(" ");
						diff2++;
					} else
						sb.append(0 - i).append(" ");
				}
				System.out.println(sb.toString());
			}
		}

	}

}
