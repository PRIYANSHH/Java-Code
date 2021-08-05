package Codechef;

import java.util.*;

public class findh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int a[] = new int[10];
			int sum = 0, sum1 = 0, k = 0, gt = 0;
			for (int i = 0; i < 10; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			for (int i = 0; i < 10; i++) {
				for (int j = i; j < 10; j++) {
					int f = 0;
					sum = 0;
					for (int y = i; y < j; y++) {
						if (y == j - 1)
							sum1 = (0 ^ a[y]);
						else
							sum1 = (a[y + 1] ^ a[y]);
						k = (int) (Math.log(sum1) / Math.log(2));
						sum = (int) (Math.pow(2, k));
						y++;
						System.out.print(a[y] + " "+a[y+1]);
					}
					System.out.println();
					if (sum > 0) {
						gt += sum;
					}
				}
			}
			System.out.println("\n" + gt);
		}

	}
}