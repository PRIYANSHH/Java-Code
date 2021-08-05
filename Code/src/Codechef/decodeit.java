package Codechef;

import java.util.*;

public class decodeit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			int i, j;
			String s3 = "";
			for (i = 0; i <= n - 4; i += 4) {
				String s2 = "";
				for (j = i; j < 4 + i; j++) {
					s2 += s.charAt(j);
				}
				int ne = Integer.parseInt(s2, 2);
				char cc = (char) (97 + ne);
				s3 += cc;
			}
			System.out.println(s3);
		}
	}
}
