package CodeIt;

import java.io.*;
import java.util.StringTokenizer;

class ss {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		String s, s1 = "", s2 = "", s3 = "";
		int i, j, k, l, ls, m, n;
		System.out.println("Enter the Sentence:");
		s = d.readLine();
		System.out.println("Reversed String:");
		int len = s.length();
		for (i = len - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		System.out.println(s1);
		StringTokenizer ob = new StringTokenizer(s);
		l = ob.countTokens();
		System.out.println("No of words are:" + l);
		String str[] = new String[l];
		System.out.println("All words are:");
		for (j = 0; j < l; j++) {
			str[j] = ob.nextToken();
			System.out.println(str[j]);
		}
		System.out.println("Reversed:");
		for (m = l - 1; m >= 0; m--) {
			System.out.print(str[m] + " ");
		}
		System.out.println();
		System.out.println("Reversed Tokens are:");
		for (k = 0; k < l; k++) {
			ls = 0;
			s2 = str[k];
			ls = s2.length();
			for (n = ls - 1; n >= 0; n--) {
				s3 += s2.charAt(n);
			}
			s3 += " ";
		}
		System.out.println(s3);
	}
}