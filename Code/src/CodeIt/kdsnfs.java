package CodeIt;

import java.util.*;
import java.io.*;

class kdsnfs {
	public static void main(String args[]) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		Scanner sc = new Scanner(System.in);
		String s;
		int p, p1;
		char n;
		s = d.readLine();
		p = (int) s.charAt(0);
		n = s.charAt(2);
		p1 = Integer.parseInt(String.valueOf(n));
		System.out.println(p + "," + p1);
	}
}