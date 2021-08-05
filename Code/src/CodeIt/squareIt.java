package CodeIt;

import java.util.*;
import java.io.*;
import java.lang.Math;

class squareIt {
	static int m = 100005;
	static long tree[] = new long[m << 2];

	static void build(int node, int s, int e, int a[]) {
		if (s == e) {
			tree[node] = (1L * a[s]) % 4;
			return;
		}
		int mid = (s + e) >> 1;
		build(2 * node, s, mid, a);
		build(2 * node + 1, mid + 1, e, a);
		tree[node] = (tree[2 * node] * tree[2 * node + 1]) % 4;
	}

	static long check(int node, int s, int e, int l, int r) {
		if (s > e || s > r || e < l) {
			return 1;
		}
		if (s >= l && e <= r) {
			return tree[node] % 4;
		}
		int mid = (s + e) >> 1;
		long q1 = check(2 * node, s, mid, l, r);
		long q2 = check(2 * node + 1, mid + 1, e, l, r);
		return (q1 * q2) % 4;
	}

	static long count(int a[], int n) {
		int i, j;
		long c = 0;
		for (i = 0; i < n; i++) {
			int low = i, high = n - 1;
			while (low <= high) {
				int mid = (low + high) >> 1;
				long pro = check(1, 0, n - 1, i, mid);
				if (Math.abs(pro) != 2)
					high = mid - 1;
				else
					low = mid + 1;
			}
			c += n - low;
		}

		/*
		 * for(i=0;i<n;i++) { for(j=i;j<n;j++) { long pro=check(1,0,n-1,i,j); if
		 * (Math.abs(pro)!=2) { c++; } } }
		 */
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, n, i;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			build(1, 0, n - 1, a);
			System.out.println(count(a, n));
		}
	}
}