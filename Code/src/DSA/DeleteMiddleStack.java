package DSA;

import java.util.*;

public class DeleteMiddleStack {
	static void del(Stack<Integer> st, int n, int curr) {
		if (st.empty() || curr == n)
			return;
		int x = st.pop();
		del(st, n, curr + 1);
		if (curr != n / 2)
			st.push(x);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int n = sc.nextInt();
		int i;
		for (i = 0; i < n; i++)
			st.push(sc.nextInt());
		del(st, n, 0);
			System.out.println(st);
	}
}