package linkedlist;

import java.util.*;

public class MiddleElement {
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

	static MiddleElement insert(MiddleElement list, int data) {
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

	static int search(MiddleElement list) {
		Node currNode1 = list.head;
		Node currNode2 = list.head;
		int i = 0;
		while (currNode2 != null) {
			i++;
			currNode2 = currNode2.next;
			if ((i & 1) == 0)
				currNode1 = currNode1.next;
		}
		return currNode1.data;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MiddleElement list = new MiddleElement();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		System.out.println(search(list));
	}
}