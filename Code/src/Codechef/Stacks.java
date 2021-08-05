package Codechef;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			Stack<Integer> st = new Stack<Integer>();
			Queue<Integer> qu = new PriorityQueue<Integer>();
			int i;
			int n = sc.nextInt();
			for (i = 0; i < n; i++)
				st.push((i + 1));
			for (i = 0; i < n; i++)
				System.out.print(st.pop() + " ");
			System.out.println();
			for (i = 0; i < n; i++)
				qu.add((i + 1));
			for (i = 0; i < n; i++)
				System.out.print(qu.remove() + " ");
			System.out.println();
		}
	}
}