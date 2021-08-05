package Codechef;

import java.util.*;

public class AugLunch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int i, p = 0;
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
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
				b[p++] = entry.getValue();
			}
			Map<Integer, Integer> mp2 = new HashMap<>();
			for (i = 0; i < p; i++) {
				if (mp2.containsKey(b[i])) {
					mp2.put(b[i], mp2.get(b[i]) + 1);
				} else {
					mp2.put(b[i], 1);
				}
			}
			int k = 0;
			for (Map.Entry<Integer, Integer> entry : mp2.entrySet()) {
				b[k] = entry.getValue();
				c[k] = entry.getKey();
				k++;
			}
			int t = 0, t1 = 0, l = k;
			for (i = 0; i < l - 1; i++) {
				for (int j = 0; j < l - 1 - i; j++) {
					if (b[j] > b[j + 1]) {
						t = b[j];
						b[j] = b[j + 1];
						b[j + 1] = t;
						t1 = c[j];
						c[j] = c[j + 1];
						c[j + 1] = t1;

					}
				}
			}
			int vol = c[k - 1];
			for (i = 0; i < k; i++)
				System.out.println(b[i] + " " + c[i]);
			for (i = k - 1; i > 0; i--) {
				if (b[i] == b[i - 1]) {
					vol = c[i - 1];
				} else
					break;
			}
			System.out.println(vol);
		}

	}

}
