package Amazon;

import java.util.*;

public class PermuationOfString {
	static int count = 0;

	public static String swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

	public static void permutation(String str, int l, int r) {

		if (l == r) {
			System.out.print(str + " ");
			count++;
		}
		for (int i = l; i <= r; i++) {
			str = swap(str, l, i); // Find combinations
			permutation(str, l + 1, r); // Recursion
			str = swap(str, l, i); // Backtracking
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();
			int len = str.length();
			permutation(str, 0, len - 1);
			System.out.println();
			System.out.println("Count of Permutations : " + count);
			count = 0;
		}

	}

}