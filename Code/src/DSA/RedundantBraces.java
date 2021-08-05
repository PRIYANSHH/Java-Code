package DSA;

import java.util.*;

public class RedundantBraces {
	static boolean Redundant(String str) {
		Stack<Character> st = new Stack<>();
		char[] s = str.toCharArray();
		for (char ch : s) {
			if (ch == ')') {
				char top = st.pop();
				boolean flag = true;
				while (top != '(') {
					if (top == '+' || top == '-' || top == '*' || top == '/')
						flag = false;
					top = st.pop();
				}
				if (flag)
					return true;
			} else
				st.push(ch);
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean sr = Redundant(str);
		if (sr)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
