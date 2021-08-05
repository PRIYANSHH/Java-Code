package DSA;

import java.util.*;

public class NGE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int popped, curr;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		st.push(a[0]);
		for (int i = 1; i < n; i++) {
			curr = a[i];
			if (!st.isEmpty()) {
				popped = st.pop();
				while (popped < curr) {
					System.out.println(popped + " -- " + curr);
					if (st.isEmpty())
						break;
					popped = st.pop();
				}
				if (popped > curr)
					st.push(popped);
			}
			st.push(curr);
		}
		while (!st.isEmpty()) {
			popped = st.pop();
			curr = -1;
			System.out.println(popped + " -- " + curr);
		}
	}
}
