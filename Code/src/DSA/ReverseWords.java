package DSA;

import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = "";
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				st.push(s.charAt(i));
			else {
				while (!st.isEmpty())
					s2 += st.pop();
				s2 += s.charAt(i);
			}
		}
		while (!st.isEmpty())
			s2 += st.pop();
		System.out.println(s2);

	}

}
