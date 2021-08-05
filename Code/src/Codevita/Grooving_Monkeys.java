package Codevita;

import java.util.*;

public class Grooving_Monkeys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int i;
			int n = sc.nextInt();
			int ctr = 0;
			int x[] = new int[n + 1];
			int y[] = new int[n + 1];
			int z[] = new int[n + 1];
			for (i = 1; i < n + 1; i++)
				y[i] = i;
			for (i = 1; i < n + 1; i++)
				x[i] = sc.nextInt();
			boolean bool = true;
			while (bool) {
				ctr++;
				for (i = 1; i < n + 1; i++) {
					z[x[i]] = y[i];
				}
				if (Arrays.equals(x, y)) {
					bool = false;
					break;
				} else
					System.arraycopy(z, 0, y, 0, n + 1);
			}
			System.out.println(ctr);
		}
	}
}