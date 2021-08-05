package linkedlist;

import java.util.*;

public class Even_Odd {
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

	static Even_Odd insert(Even_Odd list, int data) {
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

	void EvenOdd() {
		Node es = null, ee = null, os = null, oe = null, currNode = head;
		while (currNode != null) {
			if ((currNode.data & 1) == 0) {
				if (es == null) {
					es = currNode;
					ee = es;
				} else {
					ee.next = currNode;
					ee = ee.next;
				}
			} else {
				if (os == null) {
					os = currNode;
					oe = os;
				} else {
					oe.next = currNode;
					oe = oe.next;
				}
			}
			currNode = currNode.next;
		}
		if (os == null || es == null)
			return;
		ee.next = os;
		oe.next = null;
		head = es;
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
		Even_Odd list = new Even_Odd();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		list.EvenOdd();
		printList(list.head);
	}
}