package Codechef;

import java.util.*;

public class orand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			int i, x, y;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < m; i++)
				b[i] = sc.nextInt();
			Set<Integer> h1 = new HashSet<Integer>();
			Stack<Integer> h2 = new Stack<Integer>();
			h1.add(0);
			h2.push(0);
			while (!h2.isEmpty()) {
				x = h2.pop();
				for (i = 0; i < n; i++) {
					y = a[i];
					if (!h1.contains(x | y)) {
						h1.add(x | y);
						h2.push(x | y);
					}
				}
				for (i = 0; i < m; i++) {
					y = b[i];
					if (!h1.contains(x & y)) {
						h1.add(x & y);
						h2.push(x & y);
					}
				}
			}
			System.out.println(h1.size());

		}

	}

}
