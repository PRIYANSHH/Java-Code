package Babbar;

import java.util.*;

public class ion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i;
		for (i = 0; i < 5; i++)
			num[i] = sc.nextInt();
		int num2 = sc.nextInt();
		if (num2 % 2 == 0)
			System.out.println("NA");
		else {
			int count = 0;
			for (i = 0; i < 5; i++) {

				if (num[i] == num2)
					count++;
			}
			System.out.println(count);
		}

	}

}
