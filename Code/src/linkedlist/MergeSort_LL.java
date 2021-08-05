package linkedlist;

import java.util.*;

public class MergeSort_LL {
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

	static Node MergeSort(Node a, Node b) {
		Node result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.data <= b.data) {
			result = a;
			result.next = MergeSort(a.next, b);
		} else {
			result = b;
			result.next = MergeSort(a, b.next);
		}
		return result;
	}

	static Node merge(Node h) {
		if (h == null || h.next == null) {
			return h;
		}
		Node middle = getMiddle(h);
		Node nextofmiddle = middle.next;
		middle.next = null;
		Node left = merge(h);
		Node right = merge(nextofmiddle);
		Node sortedlist = MergeSort(left, right);
		return sortedlist;
	}

	public static MergeSort_LL insert(MergeSort_LL list, int data) {
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

	static Node getMiddle(Node head) {
		if (head == null)
			return head;
		Node slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static void printList(Node currNode) {
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort_LL list = new MergeSort_LL();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		list.head = merge(list.head);
		System.out.print("Sorted Linked List is: ");
		printList(list.head);
	}
}