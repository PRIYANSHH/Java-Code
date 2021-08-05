package HackerRank;

import java.util.*;

public class ConsecutiveBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String s = sc.next();
			char ch[] = s.toCharArray();
			int len = s.length();
			int a[] = new int[len + 1];
			int i, c1 = 0, c2 = 0, flag = 0, p = 0;
			char chh = ch[0];
			if (chh == '0')
				p = 1;
			for (i = 0; i < len - 1; i++) {
				flag = 0;
				if (ch[i] == '1' && ch[i + 1] == '1') {
					c1++;
					flag = 1;
				} else if (ch[i] == '1' && ch[i + 1] != '1') {
					c1++;
					a[p++] = c1;
					flag = 2;
					c1 = 0;
				} else if (ch[i] == '0' && ch[i + 1] == '0') {
					c2++;
					flag = 3;
				} else if (ch[i] == '0' && ch[i + 1] != '0') {
					c2++;
					a[p++] = c2;
					flag = 4;
					c2 = 0;
				}
				if (i == len - 2) {
					if (flag == 1)
						a[p++] = c1 + 1;
					else if (flag == 2)
						a[p++] = 1;
					else if (flag == 3)
						a[p++] = c2 + 1;
					else if (flag == 4)
						a[p++] = 1;
				}
			}
			int max = 0;
			for (i = 0; i < p - 2; i += 2) {
				if ((a[i + 1] == 0 || a[i + 1] == 2) && a[i] + a[i + 2] > max)
					max = a[i] + a[i + 2];
				else if (a[i + 1] == 1 && (a[i] + a[i + 2] - 1) > max)
					max = a[i] + (a[i + 2] - 1);
				if (a[i] > max)
					max = a[i];
				if (a[i + 2] > max)
					max = a[i + 2];
			}
			System.out.println(max);
		}

	}

}
