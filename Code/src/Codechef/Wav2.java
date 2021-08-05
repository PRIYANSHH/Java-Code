package Codechef;

import java.util.*;

public class Wav2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int a[] = new int[n];
		int i;
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for (i = 0; i < q; i++) {
			int x = sc.nextInt();
			int root = (int) Math.sqrt(n);
			int pos = n - 1;
			while (pos - root >= 0 && a[pos - root] > x)
				pos = pos - root;
			while (pos > 0 && a[pos] > x)
				pos--;
			if (a[pos] == x)
				System.out.println("0");
			else if ((pos & 1) == 1)
				System.out.println("NEGATIVE");
			else
				System.out.println("POSITIVE");
		}
	}
}