package Babbar;

import java.util.*;

public class SecondMost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			String str[] = new String[n];
			int i;
			for (i = 0; i < n; i++)
				str[i] = sc.next();
			HashMap<String, Integer> mp = new HashMap<>();
			for (i = 0; i < n; i++) {
				if (mp.containsKey(str[i]))
					mp.put(str[i], mp.get(str[i]) + 1);
				else
					mp.put(str[i], 1);
			}
			for (Map.Entry map : mp.entrySet()) {
				if ((int) map.getValue() == 2) {
					System.out.println(map.getKey());
					break;
				}
			}
			System.out.println(mp);
		}

	}

}
