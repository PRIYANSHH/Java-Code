package linkedlist;

import java.util.*;

public class ReverseList {
	Node head;
	Node temp;

	/*
	 * void push(int new_data) { Node new_node = new Node(new_data); new_node.next =
	 * head; head = new_node; }
	 */
	static ReverseList insert(ReverseList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null)
			list.head = new_node;
		else
			list.temp.next = new_node;
		list.temp = new_node;
		return list;
	}

	static Node Reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

	static void printList(Node currNode) {
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseList list = new ReverseList();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		list.head = Reverse(list.head);
		printList(list.head);
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}
