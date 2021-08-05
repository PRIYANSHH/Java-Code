package Babbar;

import java.util.*;

public class ViewsOfBTree {
	static Scanner sc = new Scanner(System.in);

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}

	static Queue<Integer> leftView(Node root) {
		Queue<Integer> queue = new LinkedList<>();
		Queue<Node> que = new LinkedList<>();
		que.add(root);
		while (!que.isEmpty()) {
			int n = que.size();
			for (int i = 0; i < n; i++) {
				Node curr = que.remove();
				if (i == 0)
					queue.add(curr.data);
				if (curr.left != null)
					que.add(curr.left);
				if (curr.right != null)
					que.add(curr.right);
			}
		}
		return queue;
	}

	static Queue<Integer> rightView(Node root) {
		Queue<Integer> queue = new LinkedList<>();
		Queue<Node> que = new LinkedList<>();
		que.add(root);
		while (!que.isEmpty()) {
			int n = que.size();
			for (int i = 0; i < n; i++) {
				Node curr = que.remove();
				if (i == n - 1)
					queue.add(curr.data);
				if (curr.left != null)
					que.add(curr.left);
				if (curr.right != null)
					que.add(curr.right);
			}
		}
		return queue;
	}

	public static void main(String[] args) {
		Node root = createTree();
		System.out.println("Left view: " + leftView(root));
		System.out.println("Right view: " + rightView(root));
	}
}