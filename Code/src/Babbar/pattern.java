package Babbar;

import java.util.*;

public class pattern {
	static Scanner sc = new Scanner(System.in);
	static Node head = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static Node insert() {
		int i = 0;
		while (i <= 5) {
			i++;
			int d = sc.nextInt();
			Node temp = new Node(d);
			Node temp2 = head;
			if (head == null) {
				head = temp;
				temp2 = temp;
			} else {
				temp2.next = temp;
			}
			temp2 = temp2.next;
		}
		return head;
	}

	public static Node remove(Node head) {
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		return prev;
	}

	public static void main(String argos[]) {
		Node root = insert();
		Node removed = remove(root);
		System.out.println(removed.data);
	}
}
