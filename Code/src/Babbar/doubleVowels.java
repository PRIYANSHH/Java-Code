package Babbar;

import java.util.*;

public class doubleVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();
			String words[] = str.split(" ");
			int i, len = str.length();
			String str2 = "";
			for (i = 0; i < len; i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u')
					str2 += str.charAt(i) + "" + str.charAt(i);
				else
					str2 += str.charAt(i);
			}
			System.out.println(str2);
		}

	}

}
