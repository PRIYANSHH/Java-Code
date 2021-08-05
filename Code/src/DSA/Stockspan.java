package DSA;

import java.util.*;

public class Stockspan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Stack<Integer> st = new Stack<Integer>();
			int span[] = new int[n];
			span[0] = 1;
			st.push(0);
			for (i = 1; i < n; i++) {
				while (!st.isEmpty() && a[st.peek()] <= a[i])
					st.pop();
				span[i] = (st.empty()) ? (i + 1) : (i - st.peek());
				st.push(i);
			}
			for (i = 0; i < n; i++)
				System.out.print(span[i] + " ");
			System.out.println();
		}

	}

}
