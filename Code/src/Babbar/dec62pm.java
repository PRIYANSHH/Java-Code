package Babbar;

import java.util.*;

public class dec62pm {
	public static String MatrixChallenge(String strArr[]) {
		int len = strArr[0].length();
		int flag = 0;
		int row = 0, col = 0;
		String str = "not found";
		for (int i = 0; i < strArr.length - 1; i++) {
			if (flag == 1)
				break;
			for (int j = 0; j < len - 1; j++) {
				if ((strArr[i].charAt(j) == 'a' || strArr[i].charAt(j) == 'e' || strArr[i].charAt(j) == 'i'
						|| strArr[i].charAt(j) == 'o' || strArr[i].charAt(j) == 'u')
						&& (strArr[i].charAt(j + 1) == 'a' || strArr[i].charAt(j + 1) == 'e'
								|| strArr[i].charAt(j + 1) == 'i' || strArr[i].charAt(j + 1) == 'o'
								|| strArr[i].charAt(j + 1) == 'u')
						&& (strArr[i + 1].charAt(j) == 'a' || strArr[i + 1].charAt(j) == 'e'
								|| strArr[i + 1].charAt(j) == 'i' || strArr[i + 1].charAt(j) == 'o'
								|| strArr[i + 1].charAt(j) == 'u')
						&& (strArr[i + 1].charAt(j + 1) == 'a' || strArr[i + 1].charAt(j + 1) == 'e'
								|| strArr[i + 1].charAt(j + 1) == 'i' || strArr[i + 1].charAt(j + 1) == 'o'
								|| strArr[i + 1].charAt(j + 1) == 'u')) {
					flag = 1;
					row = i;
					col = j;
					str = row + "-" + col;
					break;
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(MatrixChallenge(sc.nextLine().split(" ")));
	}
}