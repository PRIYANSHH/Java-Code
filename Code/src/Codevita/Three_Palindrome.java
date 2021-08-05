package Codevita;

import java.util.*;

public class Three_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String s = sc.next();
			int len = s.length();
			int i, j, k = 0, count = 0;
			String str4 = "", str5 = "", str6 = "";
			for (i = 0; i < len - 2; i++) {
				count = 0;
				k++;
				StringBuilder str1 = new StringBuilder(s.substring(0, i + 1));
				if ((str1.toString()).equals(str1.reverse().toString())) {
					count++;
					str4 = str1.toString();
					for (j = i + 1; j < len - 1; j++) {
						count = 1;
						StringBuilder str2 = new StringBuilder(s.substring(k, j + 1));
						StringBuilder str3 = new StringBuilder(s.substring(j + 1, len));
						if ((str2.toString()).equals(str2.reverse().toString())) {
							count++;
							str5 = str2.toString();
							if ((str3.toString()).equals(str3.reverse().toString())) {
								count++;
								str6 = str3.toString();
							}
						}
						if (count == 3)
							break;
					}
				}
				if (count == 3)
					break;
			}
			if (count == 3) {
				System.out.println(str4.toString());
				System.out.println(str5.toString());
				System.out.println(str6.toString());
			} else
				System.out.println("Impossible");
		}
	}

}
