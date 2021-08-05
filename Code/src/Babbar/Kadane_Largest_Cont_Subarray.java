package Babbar;

import java.util.*;

public class Kadane_Largest_Cont_Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i, flag1, flag2;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int meh1 = 0, msf1 = Integer.MIN_VALUE, start1 = 0, end1 = 0;
			for (i = 0; i < n; i++) {
				meh1 += a[i];
				flag1 = 0;
				flag2 = 0;
				if (meh1 < a[i]) {
					meh1 = a[i];
					flag1 = 1;
				}
				if (msf1 < meh1) {
					msf1 = meh1;
					flag2 = 1;
				}
				if (flag1 == 1 && flag2 == 1) {
					start1 = i;
					end1 = i;
				}
				if (flag2 == 1)
					end1 = i;
			}
			int meh2 = 0, msf2 = Integer.MAX_VALUE, start2 = 0, end2 = 0;
			for (i = 0; i < n; i++) {
				meh2 += a[i];
				flag1 = 0;
				flag2 = 0;
				if (meh2 > a[i]) {
					meh2 = a[i];
					flag1 = 1;
				}
				if (msf2 > meh2) {
					msf2 = meh2;
					flag2 = 1;
				}
				if (flag1 == 1 && flag2 == 1) {
					start2 = i;
					end2 = i;
				}
				if (flag2 == 1)
					end2 = i;
			}
			System.out.print("Subarray with Largest sum: [");
			for (i = start1; i <= end1; i++) {
				if (i != end1)
					System.out.print(a[i] + ", ");
				else
					System.out.print(a[i]);
			}
			System.out.println("]");
			System.out.println("Sum: " + msf1);
			System.out.print("Subarray with Smallest sum: [");
			for (i = start2; i <= end2; i++) {
				if (i != end2)
					System.out.print(a[i] + ", ");
				else
					System.out.print(a[i]);
			}
			System.out.println("]");
			System.out.println("Sum: " + msf2);
		}

	}

}
