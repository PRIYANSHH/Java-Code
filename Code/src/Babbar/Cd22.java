package Babbar;

import java.util.*;

public class Cd22 {
	static Node head;
	static Node temp;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp.next = newNode;
			temp = temp.next;
		}
	}

	static Node middle() {
		Node node = null;
		
		return node;
	}

	static void print() {
		Node curr = head;
		while (curr != null) {
			if (curr.next != null)
				System.out.print(curr.data + " -> ");
			else

				System.out.print(curr.data);
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			insert(sc.nextInt());
		}
		print();

	}

}
