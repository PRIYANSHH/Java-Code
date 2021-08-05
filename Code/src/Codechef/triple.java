package Codechef;

import java.util.*;

public class triple {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i, p, q, c = 0, s = 0;
			int a[] = new int[3];
			int b[] = new int[3];
			ArrayList<Integer> arr1 = new ArrayList<Integer>(3);
			ArrayList<Integer> arr2 = new ArrayList<Integer>(3);

			for (i = 0; i < 3; i++)
				a[i] = sc.nextInt();
			for (i = 0; i < 3; i++)
				b[i] = sc.nextInt();
			for (i = 0; i < 3; i++) {
				p = b[i] - a[i];
				// System.out.println("p =" + p);
				if (a[i] == b[i])
					continue;
				if (!arr1.contains(p))
					arr1.add(p);
				if (a[i] != 0 && (b[i] % a[i] == 0)) {
					q = b[i] / a[i];
					// System.out.println("q =" + q);
					c++;
					if (!arr2.contains(q))
						arr2.add(q);

				}
			}
//			int r = Math.min(arr1.size(), arr2.size());
//			if (arr2.size() != 0 && (c - s) > 0 && s > 0)
//				System.out.println(r);
//			else
//				System.out.println(arr1.size());
			System.out.println(arr1);
			System.out.println(arr2);
		}
	}
}