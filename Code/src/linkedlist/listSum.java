package linkedlist;

import java.util.*;

public class listSum {
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

	static listSum insert1(listSum list1, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list1.head == null) {
			list1.head = new_node;
			list1.temp = new_node;
		} else {
			list1.temp.next = new_node;
			list1.temp = new_node;
		}
		return list1;
	}

	static listSum insert2(listSum list2, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list2.head == null) {
			list2.head = new_node;
			list2.temp = new_node;
		} else {
			list2.temp.next = new_node;
			list2.temp = new_node;
		}
		return list2;
	}

	static Node Sum(Node l1, Node l2) {
		Node res = null, prev = null, temp = null;
		int carry = 0, sum = 0, p1 = 0, p2 = 0;
		while (l1 != null || l2 != null) {
			if (l1 != null)
				p1 = l1.data;
			else
				p1 = 0;
			if (l2 != null)
				p2 = l2.data;
			else
				p2 = 0;
			sum = carry + p1 + p2;
			if (sum > 9)
				carry = 1;
			else
				carry = 0;
			sum = sum % 10;
			temp = new Node(sum);
			if (res == null)
				res = temp;
			else
				prev.next = temp;
			prev = temp;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (carry > 0)
			temp.next = new Node(carry);
		return res;
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
		listSum list1 = new listSum();
		listSum list2 = new listSum();
		listSum list3 = new listSum();
		System.out.println("Enter the elements in  list1 or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list1 = insert1(list1, choice);
		}
		System.out.println("Enter the elements in  list2 or -1 to terminate:");
		choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list2 = insert2(list2, choice);
		}
		Node result = Sum(list1.head, list2.head);
		printList(result);
	}
}