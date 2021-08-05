package Codevita;

import java.util.*;

public class virus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, count = 0, p, q, ctr = 0, tot = 0;
		String ch[] = new String[9];
		for (i = 0; i < 9; i++)
			ch[i] = sc.next();
		char a[][] = new char[9][20];
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 20; j++) {
				a[i][j] = ch[i].charAt(j);
				if (a[i][j] == 'a' || a[i][j] == 'c')
					tot++;
			}
		}
		System.out.println("0 0");
		i = 7;
		j = 1;
		p = 8;
		q = 0;
		while ((i >= 0 && i <= 8) && (j >= 0 && j <= 19)) {
			if ((i == 0 && j == 0) || (i == 0 && j == 19) || (i == 8 && j == 0) || (i == 8 && j == 19)) {
				System.out.println(j + " " + (8 - i));
				break;
			} else if (a[i][j] == 'a') {
				ctr++;
				a[i][j] = '-';
				System.out.println(j + " " + (8 - i));
				if (i < p && j > q) {
					p = i;
					q = j;
					i--;
					j--;
				} else if (i < p && j < q) {
					p = i;
					q = j;
					i++;
					j--;
				} else if (i > p && j < q) {
					p = i;
					q = j;
					i++;
					j++;
				} else if (i > p && j > q) {
					p = i;
					q = j;
					i--;
					j++;
				}
			} else if (a[i][j] == 'c') {
				ctr++;
				a[i][j] = '-';
				System.out.println(j + " " + (8 - i));
				if (i < p && j > q) {
					p = i;
					q = j;
					i++;
					j++;
				} else if (i < p && j < q) {
					p = i;
					q = j;
					i--;
					j++;
				} else if (i > p && j < q) {
					p = i;
					q = j;
					i--;
					j--;
				} else if (i > p && j > q) {
					p = i;
					q = j;
					i++;
					j--;
				}
			} else if (a[i][j] == '.') {
				System.out.println(j + " " + (8 - i));
				if (i < p && j > q) {
					p = i;
					q = j;
					i--;
					j++;
				} else if (i < p && j < q) {
					p = i;
					q = j;
					i--;
					j--;
				} else if (i > p && j < q) {
					p = i;
					q = j;
					i++;
					j--;
				} else if (i > p && j > q) {
					p = i;
					q = j;
					i++;
					j++;
				}
			} else if (a[i][j] == '*') {
				System.out.println(j + " " + (8 - i));
				count++;
				if (count < 3) {
					if (j == 0 || j == 19) {
						if (i < p && j < q) {
							p = i;
							q = j;
							i--;
							j++;
						} else if (i > p && j < q) {
							p = i;
							q = j;
							i++;
							j++;
						} else if (i < p && j > q) {
							p = i;
							q = j;
							i--;
							j--;
						} else if (i > p && j > q) {
							p = i;
							q = j;
							i++;
							j--;
						}
					} else if (i == 0 || i == 8) {
						if (i < p && j < q) {
							p = i;
							q = j;
							i++;
							j--;
						} else if (i > p && j < q) {
							p = i;
							q = j;
							i--;
							j--;
						} else if (i < p && j > q) {
							p = i;
							q = j;
							i++;
							j++;
						} else if (i > p && j > q) {
							p = i;
							q = j;
							i--;
							j++;
						}
					}
				}
			}
			if (count == 2)
				break;
		}
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 20; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("safe=" + (tot - ctr));
		System.out.println("infected=" + ctr);
	}

}
