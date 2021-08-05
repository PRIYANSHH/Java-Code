package Codechef;

import java.util.*;

public class rick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		double c = 0.0;
		double d = 0.0;
		while (test-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < 10 && b < 10)
				System.out.println("1 1");
			else {
				c = Math.ceil(a / 9.0);
				d = Math.ceil(b / 9.0);
				if (c >= d)
					System.out.println("1" + " " + (int)d);
				else
					System.out.println("0" + " " + (int)c);
			}
		}
	}

}