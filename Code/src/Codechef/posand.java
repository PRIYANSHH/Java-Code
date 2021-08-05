package Codechef;

import java.util.*;

public class posand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			StringBuilder s = new StringBuilder();
			s.append("2 3 1 ");
			int i;
			if (n == 1)
				System.out.println("1");
			else if ((n & (n - 1)) == 0)
				System.out.println("-1");
			else if (n == 3) {
				System.out.println("2 3 1");
			} else {
				int p = 0;
				for (i = 4; i <= n; i++) {
					if ((i & (i - 1)) != 0) {
						s.append(i).append(" ");
						if (p != 0) {
							s.append(p).append(" ");
							p = 0;
						}
					} else {
						p = i;
					}
				}
				System.out.println(s.toString());
			}

		}

	}

}
