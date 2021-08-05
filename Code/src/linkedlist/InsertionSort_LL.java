package linkedlist;

import java.util.*;

public class InsertionSort_LL {
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

	public static InsertionSort_LL insert(InsertionSort_LL list, int data) {
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

	void insertionSort(Node node) {
		sorted = null;
		Node currNode = node;
		while (currNode != null) {
			Node next = currNode.next;
			sort(currNode);
			currNode = next;
		}
		head = sorted;
	}

	void sort(Node new_node) {
		if (sorted == null || sorted.data >= new_node.data) {
			new_node.next = sorted;
			sorted = new_node;
		} else {
			Node currNode = sorted;
			while (currNode.next != null && currNode.next.data < new_node.data) {
				currNode = currNode.next;
			}
			new_node.next = currNode.next;
			currNode.next = new_node;
		}
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
		InsertionSort_LL list = new InsertionSort_LL();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		list.insertionSort(list.head);
		System.out.print("Sorted Linked List is: ");
		printList(list.head);
	}
}