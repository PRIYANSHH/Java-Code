package DSA;

import java.util.*;

public class BalancedBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a[] = s.toCharArray();
		int len = s.length();
		int i, count = 0;
		char p;
		Stack<Character> st = new Stack<Character>();
		if ((len & 1) == 1)
			System.out.println("Incorrect");
		else {
			for (i = 0; i < len; i++) {
				if (a[i] == '[' || a[i] == '{' || a[i] == '(') {
					st.push(a[i]);
				} else if (a[i] == ']' && st.isEmpty() == false) {
					p = st.pop();
					if (p == '[')
						count++;
					else
						break;
				} else if (a[i] == ')' && st.isEmpty() == false) {
					p = st.pop();
					if (p == '(')
						count++;
					else
						break;
				} else if (a[i] == '}' && st.isEmpty() == false) {
					p = st.pop();
					if (p == '{')
						count++;
					else
						break;
				} else
					break;
			}
			if (count == (len / 2))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
	}
}