package Codechef;

import java.util.*;

public class evenpsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long e1 = a / 2, e2 = b / 2, o1 = 0, o2 = 0;
			if ((a & 1) == 0)
				o1 = (a / 2);
			else
				o1 = (a / 2) + 1;
			if ((b & 1) == 0)
				o2 = (b / 2);
			else
				o2 = (b / 2) + 1;
			System.out.println((e1 * e2) + (o1 * o2));
		}

	}

}
