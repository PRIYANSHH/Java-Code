package Codechef;

import java.util.*;

public class tree2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, ctr = 0;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Map<Integer, Integer> mp1 = new HashMap<>();
			for (i = 0; i < n; i++) {
				if (mp1.containsKey(a[i])) {
					mp1.put(a[i], mp1.get(a[i]) + 1);
				} else {
					mp1.put(a[i], 1);
				}
			}
			for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
				if (entry.getKey() > 0)
					ctr++;
			}
			System.out.println(ctr);
		}

	}

}
