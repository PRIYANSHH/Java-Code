package DSA;

import java.util.*;

public class RectangularHistogram {

	static int MaxArea(int a[], int n) {
		Stack<Integer> st = new Stack<>();
		int top, area, calc, i = 0, max = 0;
		while (i < n) {
			if (st.isEmpty() || a[st.peek()] <= a[i])
				st.push(i++);
			else {
				top = st.pop();
				if (st.isEmpty())
					calc = i;
				else
					calc = i - st.peek() - 1;
				area = a[top] * calc;
				if (max < area)
					max = area;
			}
		}
		while (!st.isEmpty()) {
			top = st.pop();
			if (st.isEmpty())
				calc = i;
			else
				calc = i - st.peek() - 1;
			area = a[top] * calc;
			if (max < area)
				max = area;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Max Area: " + MaxArea(a, n));
	}
}
