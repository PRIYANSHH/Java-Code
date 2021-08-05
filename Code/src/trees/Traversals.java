package trees;

import java.util.*;

public class Traversals {
	static Scanner sc = new Scanner(System.in);

	static class Node {
		char data;
		Node left;
		Node right;

		Node(char d) {
			data = d;
			left = right = null;
		}
	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		char data = sc.next().charAt(0);
		if (data == '.')
			return null;
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}

	static void preorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	static void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	static void postorder(Node node) {
		if (node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	static void last(Node node) {
		if (node == null)
			return;
		last(node.left);
		if ((node.left == null && node.right != null) || (node.left != null && node.right == null))
			System.out.println(node.data);
		last(node.right);
	}

	static void sumNode(Node node) {
		if (node == null)
			return;
		sumNode(node.left);
		if (node.left == null && node.right == null)
			System.out.println(node.data);
		sumNode(node.right);
	}

	public static void main(String[] args) {
		Node root = createTree();
		System.out.println("Preorder Traversal: ");
		preorder(root);
		System.out.println("\nInorder Traversal: ");
		inorder(root);
		System.out.println("\nPostorder Traversal: ");
		postorder(root);
		System.out.println("\nNodes are");
		last(root);
		System.out.println("\nNodes are");
		sumNode(root);

	}
}