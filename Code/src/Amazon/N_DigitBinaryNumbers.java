package Amazon;

import java.util.*;

public class N_DigitBinaryNumbers {
public static void pp(int num) {
	if(num==0)
		return;
	pp(num-1);
	System.out.println(num);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pp(5);
		/*int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int i;
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int l = 0, r = n - 1;
			while (l < r) {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				l++;
				r--;
			}
			System.out.println(Arrays.toString(a));
		}*/

	}

}
