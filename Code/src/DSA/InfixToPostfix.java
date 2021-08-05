package DSA;

import java.util.*;

public class InfixToPostfix {
	static int Order(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		Stack<Character> st = new Stack<Character>();
		int i, flag = 0;
		String s2 = "";
		for (i = 0; i < len; i++) {
			flag = 0;
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch))
				s2 += ch;
			else if (ch == '(')
				st.push(ch);
			else if (ch == ')') {
				while (!st.isEmpty() && st.peek() != '(')
					s2 += st.pop();
				if (!st.isEmpty() && st.peek() != '(') {
					flag = 1;
					break;
				} else
					st.pop();
			} else {
				while (!st.isEmpty() && Order(ch) <= Order(st.peek())) {
					if (st.peek() == '(') {
						flag = 1;
						break;
					} else
						s2 += st.pop();
				}
				st.push(ch);
			}
			if (flag == 1)
				break;
		}
		while (!st.isEmpty()) {
			if (st.peek() != '(')
				s2 += st.pop();
			else {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Invalid");
		else
			System.out.println(s2);
	}

}
