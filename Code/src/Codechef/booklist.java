package Codechef;

import java.util.*;

public class booklist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int p;
		int i, j, b;
		ArrayList<Integer> a = new ArrayList<Integer>(m);
		for (i = 0; i < m; i++) {
			b = sc.nextInt();
			a.add(b);
		}
		int n = sc.nextInt();
		int c[] = new int[n];
		for (i = 0; i < n; i++) {
			p = sc.nextInt();
			j = p - 1;
			c[i] = a.get(j);
			a.remove(j);
		}
		for (i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
	}
}
