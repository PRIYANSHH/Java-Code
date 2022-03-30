package Babbar;

import java.util.*;

public class BalancedParanthesis {
	public static boolean isValid(String s) {
		int len = s.length();
		int i;
		Stack<Character> st = new Stack<>();
		for (i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(')
				st.push(ch);
			else if (!st.isEmpty()) {
				char ch2 = st.peek();
				if ((ch2 == '{' && ch == '}') || (ch2 == '[' && ch == ']') || (ch2 == '(' && ch == ')'))
					st.pop();
				else
					return false;
			} else
				return false;
		}
		if (!st.isEmpty())
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			String str = sc.next();

			if (!isValid(str))
				System.out.println("Not Balanced");
			else
				System.out.println("Balanced");
		}
	}
}