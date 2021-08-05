package Codevita;

import java.util.*;

public class textual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven",
				"twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four",
				"thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one",
				"forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight",
				"forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six",
				"fifty-seven", "fifty-eight", "fifty-nine", "sixty", "sixty-one", "sixty-two", "sixty-three",
				"sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",
				"seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six",
				"seventy-seven", "seventy-eight", "seventy-nine", "eighty", "eighty-one", "eighty-two", "eighty-three",
				"eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety",
				"ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six", "ninety-seven",
				"ninety-eight", "ninety-nine", "hundred" };
		int l = s.length;
		int f[] = new int[l];
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, j;
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < l; i++) {
			int ctr = 0;
			int len = s[i].length();
			for (j = 0; j < len; j++) {
				if (s[i].charAt(j) == 'a' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o'
						|| s[i].charAt(j) == 'u')
					ctr++;
			}
			f[i] = ctr;
		}
		int sum = 0, c = 0, u = 0, flag = 0;
		int b[] = new int[100000000];
		int ce[] = new int[100000000];
		for (i = 0; i < n; i++) {
			sum += f[a[i]];
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i != j) {
					flag = 0;
					if (a[i] >= 0 && a[j] >= 0) {
						if (a[i] + a[j] == sum) {
							for (int h = 0; h < u; h++) {
								if ((a[i] == b[h] && a[j] == ce[h]) || ((a[i] == ce[h]) && (a[j] == b[h])))
									flag = 1;
							}
							b[u] = a[i];
							ce[u] = a[j];
							u++;
							if (flag == 0)
								c++;
						}
					}
				}
			}
		}
		if (c > 100)
			System.out.println("greater 100");
		else
			System.out.println(s[c]);

	}
}