package CodeIt;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hash_set {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		int i;
		HashSet<String> pairs = new HashSet<String>(t);
		for (i = 0; i < t; i++) {
			pairs.add("(" + pair_left[i] + "," + pair_right[i] + ")");
			System.out.println(pairs.size());

		}

//Write your code here

	}
}