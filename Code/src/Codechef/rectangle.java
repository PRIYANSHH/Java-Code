package Codechef;

import java.util.*;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int i;
			int p = (4 * n) - 1;
			int x[] = new int[p];
			int y[] = new int[p];
			for (i = 0; i < p; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			Map<Integer, Integer> mp1 = new HashMap<>();
			for (i = 0; i < p; i++) {
				if (mp1.containsKey(x[i])) {
					mp1.put(x[i], mp1.get(x[i]) + 1);
				} else {
					mp1.put(x[i], 1);
				}
			}
			Map<Integer, Integer> mp2 = new HashMap<>();
			for (i = 0; i < p; i++) {
				if (mp2.containsKey(y[i])) {
					mp2.put(y[i], mp2.get(y[i]) + 1);
				} else {
					mp2.put(y[i], 1);
				}
			}
			for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
				if ((entry.getValue() & 1) == 1)
					System.out.print(entry.getKey() + " ");
			}
			for (Map.Entry<Integer, Integer> entry : mp2.entrySet()) {
				if ((entry.getValue() & 1) == 1)
					System.out.print(entry.getKey());
			}
			System.out.println();
		}
	}
}