package Codevita;

import java.util.*;

public class Swayamvar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j = 0, count = 0;
		String s1 = sc.next();
		String s2 = sc.next();
		char[] p = s1.toCharArray();
		char[] q = s2.toCharArray();
		for (i = 0; i < n; i++) {
			if (p[i] == q[j]) {
				count++;
				q[j] = 'b';
				j = 0;
			} else {
				i--;
				j++;
			}
			if (j >= n)
				break;
		}
		System.out.println(n - count);
	}
}