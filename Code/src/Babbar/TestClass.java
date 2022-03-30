package Babbar;

import java.util.*;

public class TestClass {
	public static String baseConversion(String num, int s, int d) {
		return Long.toString(Long.parseLong(num, s), d);
	}

	public static String convert(String x, int xb, String y, int yb, int b) {
		String res = "";
		Long result = Long.parseLong(baseConversion(x, xb, 10)) * Long.parseLong(baseConversion(y, yb, 10));
		res = Long.toString(Long.parseLong(baseConversion(Long.toString(result), 10, b)));
		return res;
	}

	public static void main(String args[]) {
		String x, y;
		int xb, yb, b;
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		xb = sc.nextInt();
		y = sc.next();
		yb = sc.nextInt();
		b = sc.nextInt();
		System.out.println(convert(x, xb, y, yb, b));

	}
}
