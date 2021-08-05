package trees;

import java.util.*;

public class PostFromIn_Pre {
	static int search(int arr[], int x, int n) {
		for (int i = 0; i < n; i++)
			if (arr[i] == x)
				return i;
		return -1;
	}

	static void postorder(int a[], int b[], int n) {
		int root = search(a, b[0], n);
		if (root != 0)
			postorder(a, Arrays.copyOfRange(b, 1, n), root);
		if (root != n - 1)
			postorder(Arrays.copyOfRange(a, root + 1, n), Arrays.copyOfRange(b, 1 + root, n), n - root - 1);
		System.out.print(b[0] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Nodes: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("Enter Preorder: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Enter Inorder: ");
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();
		postorder(a, b, n);
	}

}
