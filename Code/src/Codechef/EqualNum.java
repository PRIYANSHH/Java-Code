package Codechef;

import java.util.*;

public class EqualNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int i, flag = 0, k = 0, j = 0;
			String s1 = sc.next();
			String s2 = sc.next();
			int len1 = s1.length();
			int len2 = s2.length();
			int a[] = new int[len1];
			int b[] = new int[len2];
			for (i = 0; i < len1; i++) {
				char ch = s1.charAt(i);
				if (ch == ',')
					continue;
				else
					a[j++] = (int) ch;
			}
			for (i = 0; i < len2; i++) {
				char ch = s2.charAt(i);
				if (ch == ',')
					continue;
				else
					b[k++] = (int) ch;
			}
			if (j != k)
				System.out.println("different");
			else {
				for (i = 0; i < k; i++) {
					if (a[i] != b[i]) {
						System.out.println("different");
						flag = 2;
						break;
					}
				}
				if (flag == 0)
					System.out.println("equal");
			}
		}

	}

}
