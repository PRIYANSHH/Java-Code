package linkedlist;

import java.util.*;

class BreadthFirstSearch {
	private int V;
	private java.util.LinkedList<Integer> adj[];

	BreadthFirstSearch(int v) {
		V = v;
		adj = new java.util.LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new java.util.LinkedList<Integer>();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void BFS(int s) {
		boolean visited[] = new boolean[V];
		java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vertices:");
		int n = sc.nextInt();
		BreadthFirstSearch g = new BreadthFirstSearch(n);
		System.out.println("Enter no of edges: ");
		int e = sc.nextInt();
		System.out.println("Enter the vertices between which there is a edge:");
		for (int i = 0; i < e; i++)
			g.addEdge(sc.nextInt(), sc.nextInt());
		System.out.println("Enter the root:");
		int root = sc.nextInt();
		System.out.println("Breadth First Traversal " + "(starting from vertex " + root + "): ");
		g.BFS(root);
	}
}