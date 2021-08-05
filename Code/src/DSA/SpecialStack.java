package DSA;

import java.util.*;

class SpecialStack extends Stack<Integer> {
	Stack<Integer> d = new Stack<>();

	void push(int x) {
		if (isEmpty()) {
			super.push(x);
			d.push(x);
		} else {
			super.push(x);
			int y = d.pop();
			d.push(y);
			if (x <= y)
				d.push(x);
		}
	}

	public Integer pop() {
		int x = super.pop();
		int y = d.pop();
		if (y != x)
			d.push(y);
		return x;
	}

	int getMin() {
		int x = d.pop();
		d.push(x);
		return x;
	}

	public static void main(String[] args) {
		SpecialStack s = new SpecialStack();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			s.push(sc.nextInt());
		System.out.println(s.getMin());
		while (!s.isEmpty()) {
			System.out.println(s.pop());
			if (!s.isEmpty())
				System.out.println(s.getMin());
		}
	}
}