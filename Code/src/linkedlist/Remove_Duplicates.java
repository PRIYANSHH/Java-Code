package linkedlist;

import java.util.*;

public class Remove_Duplicates {
	Node head;
	Node temp;
	Node sorted;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static Remove_Duplicates insert(Remove_Duplicates list, int data) {
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

	static Node remove(Node head) {
		Node del;
		if (head == null)
			return null;
		if (head.next != null) {
			if (head.data == head.next.data) {
				del = head.next;
				head.next = head.next.next;
				remove(head);
			} else {
				remove(head.next);
			}
		}
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
		Remove_Duplicates list = new Remove_Duplicates();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		remove(list.head);
		printList(list.head);
	}
}