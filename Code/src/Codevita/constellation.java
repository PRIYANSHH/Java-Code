package Codevita;

import java.util.*;

public class constellation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			char a[][] = new char[3][n];
			String str = "";
			int i, j;
			for (i = 0; i < 3; i++) {
				for (j = 0; j < n; j++) {
					a[i][j] = sc.next().charAt(0);
				}
			}
			for (j = 0; j < n; j++) {
				if (a[0][j] == '#' && a[1][j] == '#' && a[2][j] == '#')
					str += "#";
				else if (a[0][j] == '.' && a[1][j] == '.' && a[2][j] == '.')
					str += "";
				else if (a[1][j] == '.' && a[1][j + 1] == '*' && a[1][j + 2] == '.') {
					str += "I";
					j += 2;
				} else if (a[0][j] == '*' && a[0][j + 1] == '*' && a[0][j + 2] == '*' && a[1][j] == '*'
						&& a[1][j + 1] == '*' && a[1][j + 2] == '*') {
					str += "E";
					j += 2;
				} else if (a[0][j] == '.' && a[0][j + 1] == '*' && a[0][j + 2] == '.' && a[1][j] == '*'
						&& a[1][j + 1] == '*' && a[1][j + 2] == '*') {
					str += "A";
					j += 2;
				} else if (a[0][j] == '*' && a[0][j + 1] == '*' && a[0][j + 2] == '*' && a[1][j] == '*'
						&& a[1][j + 1] == '.' && a[1][j + 2] == '*') {
					str += "O";
					j += 2;
				} else if (a[0][j] == '*' && a[0][j + 1] == '.' && a[0][j + 2] == '*' && a[1][j] == '*'
						&& a[1][j + 1] == '.' && a[1][j + 2] == '*') {
					str += "U";
					j += 2;
				}
			}
			System.out.println(str);
		}
	}
}
