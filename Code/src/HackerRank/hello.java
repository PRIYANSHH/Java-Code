package HackerRank;

import java.io.*;
import java.util.*;

public class hello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		if (A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println((char) (A.charAt(0) - 32) + A.substring(1, A.length()) + " " + (char) (B.charAt(0) - 32)
				+ B.substring(1, B.length()));
	}
}
