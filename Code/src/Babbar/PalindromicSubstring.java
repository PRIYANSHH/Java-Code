package Babbar;

import java.util.*;

public class PalindromicSubstring {
	public static String palindromeBrute(String str) {
		String pal = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;
				int l = i, r = j;
				while (l <= r) {
					if (str.charAt(l) != str.charAt(r)) {
						flag = 0;
						break;
					} else {
						l++;
						r--;
					}
				}
				if (flag == 1 && (j - i + 1) >= pal.length()) {
					pal = str.substring(i, j + 1);
				}
			}
		}
		return pal;
	}

	public static String palindromeDP(String str) {
		String pal = "";
		int len = str.length();
		int dp[][] = new int[len][len];
		int i, j;
		for (i = 0; i < len; i++)
			dp[i][i] = 1;
		
		
		return pal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();
			String pal = palindromeBrute(str);
			String pal2 = palindromeDP(str);
			System.out.println(pal);
			System.out.println(pal.length());
		}

	}

}
