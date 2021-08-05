package Codechef;

import java.util.*;

public class meet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while (test-- > 0) {
			String s = sc.nextLine();
			int n = sc.nextInt();
			sc.nextLine();
			String ab = s.charAt(6) + "" + s.charAt(7);
			int hh = Integer.parseInt(s.charAt(0) + "" + s.charAt(1));
			int mm = Integer.parseInt(s.charAt(3) + "" + s.charAt(4));
			if (ab.equals("PM") && hh != 12)
				hh += 12;
			if (ab.equals("AM") && hh == 12)
				hh = 0;
			// System.out.println(hh + " " + mm + " " + ab);
			int i;
			for (i = 0; i < n; i++) {
				String s1 = sc.nextLine();
				String a = s1.charAt(6) + "" + s1.charAt(7);
				String b = s1.charAt(15) + "" + s1.charAt(16);
				int h1 = Integer.parseInt(s1.charAt(0) + "" + s1.charAt(1));
				int m1 = Integer.parseInt(s1.charAt(3) + "" + s1.charAt(4));
				int h2 = Integer.parseInt(s1.charAt(9) + "" + s1.charAt(10));
				int m2 = Integer.parseInt(s1.charAt(12) + "" + s1.charAt(13));
				if (a.equals("PM") && h1 != 12) {
					h1 += 12;
				}
				if (b.equals("PM") && h2 != 12) {
					h2 += 12;
				}
				if (a.equals("AM") && h1 == 12) {
					h1 = 0;
				}
				if (b.equals("AM") && h2 == 12) {
					h2 = 0;
				}
				// System.out.println(h1 + " " + m1 + " " + a);
				// System.out.println(h2 + " " + m2 + " " + b);
			}
		}
	}
}