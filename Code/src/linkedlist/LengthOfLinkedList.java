package linkedlist;

import java.util.*;

public class LengthOfLinkedList {
	Node head;
	Node temp;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static LengthOfLinkedList insert(LengthOfLinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
			list.temp = new_node;
		} else {
			list.temp.next = new_node;
			list.temp = new_node;
		}
		return list;
	}

	static int length(LengthOfLinkedList list) {
		int j = 0;
		list.temp = list.head;
		while (list.temp != null) {
			j++;
			list.temp = list.temp.next;
		}
		return j;
	}

	static int RecursiveLength(Node node) {
		if (node == null)
			return 0;
		return 1 + RecursiveLength(node.next);
	}

	static int getLength(LengthOfLinkedList list) {
		return RecursiveLength(list.head);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LengthOfLinkedList list = new LengthOfLinkedList();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		System.out.println("Iterative Length = " + length(list));
		System.out.println("Recursive Length = " + getLength(list));
	}

}
