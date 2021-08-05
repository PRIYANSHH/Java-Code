package CodeIt;

import java.util.*;

class odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		Map<Integer, Integer> mp = new HashMap<>();
		n = sc.nextInt();
		int a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < n; i++) {
			if (mp.containsKey(a[i])) {
				mp.put(a[i], mp.get(a[i]) + 1);
			} else {
				mp.put(a[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() % 2 != 0)
				System.out.println(entry.getKey());
		}
	}
}