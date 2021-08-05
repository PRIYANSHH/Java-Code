package DSA;

import java.util.*;

public class LargestNumber {
	static void arrange(ArrayList<String> arr, int n) {
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				String ab = a + b;
				String ba = b + a;
				return ab.compareTo(ba) > 0 ? -1 : 1;
			}
		});
		for (int i = 0; i < n; i++)
			System.out.print(arr.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			ArrayList<String> a = new ArrayList<String>(n);
			for (int i = 0; i < n; i++)
				a.add(sc.next());
			arrange(a, n);
		}

	}

}
