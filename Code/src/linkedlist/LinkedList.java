package linkedlist;

import java.util.*;

public class LinkedList {
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

	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
			list.temp = new_node;
		} else {
			list.temp.next = new_node;
			list.temp = new_node;
		}
		System.out.println(list.temp);
		return list;
	}

	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node currNode = list.head, prev = null;
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println(key + " found and deleted");
			return list;
		}
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}
	

	public static LinkedList deleteAtPosition(LinkedList list, int index) {
		Node currNode = list.head, prev = null;
		if (index == 0 && currNode != null) {
			list.head = currNode.next;
			System.out.println(index + " position element deleted");
			return list;
		}
		int counter = 0;
		while (currNode != null) {
			if (counter == index) {
				prev.next = currNode.next;
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		if (currNode == null) {
			System.out.println(index + " position element not found");
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("Enter the no of elements to be inserted in linked list: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++)
			list = insert(list, sc.nextInt());
		printList(list);
		int choice = 1;
		while (choice == 1) {
			System.out.println("Enter the number you want to delete by Key Value:");
			deleteByKey(list, sc.nextInt());
			printList(list);
			System.out.println("Enter the number you want to delete by Positon:");
			deleteAtPosition(list, sc.nextInt());
			printList(list);
			System.out.println("Do you want to continue: 0 or 1");
			choice = sc.nextInt();
		}
		System.out.println("Terminated");
	}
}