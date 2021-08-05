package Codechef;

import java.util.*;

public class swaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>(n);
			ArrayList<Integer> b = new ArrayList<Integer>(n);
			ArrayList<Integer> res1 = new ArrayList<Integer>();
			ArrayList<Integer> res2 = new ArrayList<Integer>();
			int c[] = new int[n + n];
			int i, p, q, minimum = 0, flag = 0, j = 0;
			long sum = 0, ks = 0;
			for (i = 0; i < n; i++) {
				p = sc.nextInt();
				a.add(p);
				c[j++] = p;
			}
			for (i = 0; i < n; i++) {
				q = sc.nextInt();
				b.add(q);
				c[j++] = q;
			}
			Map<Integer, Integer> mp1 = new HashMap<>();
			for (i = 0; i < j; i++) {
				if (mp1.containsKey(c[i])) {
					mp1.put(c[i], mp1.get(c[i]) + 1);
				} else {
					mp1.put(c[i], 1);
				}
			}
			for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
				if ((entry.getValue() & 1) == 1) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				Collections.sort(a);
				Collections.sort(b);
				minimum = Math.min(a.get(0), b.get(0));
				i = 0;
				j = 0;
				while (i < a.size() && j < a.size()) {
					if (a.get(i) < b.get(j)) {
						res1.add(a.get(i));
						i++;
					} else if (b.get(j) < a.get(i)) {
						j++;
					} else {
						i++;
						j++;
					}
				}
				for (int k = i; k < a.size(); k++)
					res1.add(a.get(k));
				i = 0;
				j = 0;
				while (i < b.size() && j < a.size()) {
					if (b.get(i) < a.get(j)) {
						res2.add(b.get(i));
						i++;
					} else if (b.get(i) > a.get(j)) {
						j++;
					} else {
						i++;
						j++;
					}
				}
				for (int k = i; k < a.size(); k++)
					res2.add(b.get(k));
				if (res1.size() == 0 && res2.size() == 0)
					flag = 2;
			}
			if (flag != 1 && flag != 2) {
				int size = res1.size();
				for (i = 0; i < size; i++) {
					if (i < (size - i - 1)) {
						ks = Math.min(res1.get(i), res2.get(size - i - 1));
						if (ks <= (minimum * 2))
							sum += ks;
						else
							sum += (minimum * 2);
						i++;
					} else
						break;
				}
				for (i = 0; i < size; i++) {
					if (i < (size - i - 2)) {
						ks = Math.min(res2.get(i), res1.get(size - i - 1));
						if (ks <= (minimum * 2))
							sum += ks;
						else
							sum += (minimum * 2);
						i++;
					} else
						break;
				}
			}
			if (flag == 1)
				System.out.println("-1");
			else if (flag == 2)
				System.out.println("0");
			else
				System.out.println(sum);
		}
	}
}