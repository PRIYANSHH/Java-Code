package Codevita;

import java.util.*;

public class fiveight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String s = sc.next();
			int n = s.length();
			int sum = 0, a = 0, flag = 0, sum2 = 0;
			String s2 = "";
			for (int i = 0; i < n; i++) {
				if ((s.charAt(i) != '5') && (flag == 0)) {
					a = s.charAt(i) - '0';
					sum += a;
				} else if (s.charAt(i) == '8') {
					flag = 0;
					s2 += s.charAt(i);
				} else {
					flag = 1;
					s2 += s.charAt(i);
				}
			}
			sum2 = sum + Integer.parseInt(s2);
			System.out.println(sum2);
		}
	}
}
