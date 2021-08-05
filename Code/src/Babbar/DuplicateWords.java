package Babbar;

import java.util.*;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while (test-- > 0) {
			String str = sc.nextLine();
			String words[] = str.split(" ");
			HashMap<String, Integer> map = new HashMap<>();
			for (String word : words) {
				if (map.containsKey(word))
					map.put(word, map.get(word) + 1);
				else
					map.put(word, 1);
			}
			for (Map.Entry mp : map.entrySet()) {
				if ((int) mp.getValue() > 1)
					System.out.println(mp.getKey());
			}
			System.out.println(map);
		}
	}
}