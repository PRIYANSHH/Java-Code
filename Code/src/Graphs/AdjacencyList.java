package Graphs;

import java.util.*;

public class AdjacencyList {
	private static LinkedList<Integer> adj[];

	public AdjacencyList(int v) {
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public void print(LinkedList<Integer> adj[]) {
		for (int i = 0; i < adj.length; i++) {
			System.out.println(i + " -> " + adj[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		AdjacencyList g = new AdjacencyList(v);
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}
		g.print(adj);

	}

}
