package trees;

import java.util.*;

public class Inorder_Stack {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	void inorder() {
		if (root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	public static void main(String[] args) {
		Inorder_Stack tree = new Inorder_Stack();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("Inorder Traversal: ");
		tree.inorder();
	}

}
