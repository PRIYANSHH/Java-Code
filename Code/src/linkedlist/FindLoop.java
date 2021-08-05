package linkedlist;

import java.util.*;

public class FindLoop {
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

	static FindLoop insert(FindLoop list, int data) {
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

	static void search(FindLoop list) {
		Node currNode1 = list.head, currNode2 = list.head;
		int i = -1, flag = 0;
		while (currNode2 != null) {
			i++;
			currNode2 = currNode2.next;
			if ((i & 1) == 1)
				currNode1 = currNode1.next;
			if (currNode1 == currNode2) {
				System.out.println("Loop found");
				System.out.println(i / 2 + 1);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("No Loops");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindLoop list = new FindLoop();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		list.head.next.next.next = list.head;
		search(list);
	}
}