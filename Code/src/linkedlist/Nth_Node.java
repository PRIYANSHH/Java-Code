package linkedlist;

import java.util.*;

public class Nth_Node {
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

	static Nth_Node insert(Nth_Node list, int data) {
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

	static int length(Nth_Node list) {
		int j = 0;
		list.temp = list.head;
		while (list.temp != null) {
			j++;
			list.temp = list.temp.next;
		}
		return j;
	}

	static void Nnode(Nth_Node list, int n) {
		Node currNode = list.head;
		int i = -1;
		while (currNode != null) {
			i++;
			if (i == n) {
				System.out.println(currNode.data);
				break;
			}
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nth_Node list = new Nth_Node();
		System.out.println("Enter the elements or -1 to terminate:");
		int choice = 0;
		while (choice != -1) {
			choice = sc.nextInt();
			if (choice != -1)
				list = insert(list, choice);
		}
		int p = length(list);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		if (n > p - 1)
			System.out.println("Index does not exist");
		else {
			System.out.print(n + "th Node from Beginnnig: ");
			Nnode(list, n);
			System.out.print(n + "th Node from End: ");
			Nnode(list, p - n - 1);
		}
	}
}