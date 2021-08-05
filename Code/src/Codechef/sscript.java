package Codechef;

import java.util.*;

public class sscript {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			int i, count = 0, flag = 0;
			for (i = 0; i < n; i++) {
				if (s.charAt(i) == '*')
					count++;
				else
					count = 0;
				if (count == k) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
