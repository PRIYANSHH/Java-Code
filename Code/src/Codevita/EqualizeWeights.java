package Codevita;

import java.util.*;

public class EqualizeWeights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int i, k = 0, sum = 0;
			int a[] = new int[n];
			int b[] = new int[n * n];
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[k] = sc.nextInt();
				sum += b[k];
				k++;
			}
			int p=sum/k;
			

		}

	}

}
