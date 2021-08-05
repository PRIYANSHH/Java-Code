package Babbar;

import java.util.*;

public class StringArrangement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();
			String words[] = str.split(" ");
			int i, len = str.length();
			String str2 = "";
			char temp;
			int count = 1;
			for (i = 0; i < len - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					count++;
					temp = str.charAt(i);
				}
			}
		}

	}

}
