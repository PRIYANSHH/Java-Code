package Codechef;

import java.util.*;

public class OctLunch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			long x = sc.nextLong();
			if ((x & 1) == 0) {
				System.out.println(x / 2 + " " + x / 2);
			} else {
				System.out.println(x + " 0");
			}
		}
	}

}
