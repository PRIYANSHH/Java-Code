package Codechef;

import java.util.*;

public class advancedtcs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = 0, i, count = 0;
			int arr[] = new int[a];
			if (a < 10) {
				b = a + 10;
				System.out.println(b);
			} else if (a >= 10) {
				int k = 0;
				for (i = 9; i > 1; i--) {
					while (a % i == 0) {
						arr[k++] = i;
						a /= i;
						count++;
					}
				}
				if (a != 1)
					System.out.println("Not Possible");
				else {
					long ans = 1;
					String s = "", str = "";
					for (i = 0; i < k; i++) {
						ans *= arr[i];
						s += Integer.toString(arr[i]);
						if (ans == a)
							break;
					}
					for (i = s.length() - 1; i >= 0; i--)
						str += s.charAt(i);
					System.out.println(str);
				}
			}
		}

	}

}
