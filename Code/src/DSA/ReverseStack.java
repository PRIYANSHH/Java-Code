package DSA;

import java.util.*;

public class ReverseStack {
	static Stack<Integer> st = new Stack<Integer>();

	static void insertAtBottom(int x) {

		if (st.isEmpty())
			st.push(x);
		else {
			int a = st.peek();
			st.pop();
			insertAtBottom(x);
			st.push(a);
		}
	}

	static void reverseStack() {
		if (st.size() > 0) {
			int x = st.peek();
			st.pop();
			reverseStack();
			insertAtBottom(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for (i = 0; i < n; i++)
			st.push(sc.nextInt());
		reverseStack();
			System.out.println(st);
	}

}
