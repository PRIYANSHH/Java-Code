package Codechef;

import java.util.*;

public class darth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int h = sc.nextInt();
			int p = sc.nextInt();
			while (h > 0 && p > 0) {
				h -= p;
				p /= 2;
			}
			if (h <= 0)
				System.out.println("1");
			else if (p <= 0)
				System.out.println("0");
		}

	}

}
