package Graphs;

import java.util.*;

public class TopologicalSortBFS {
	private static LinkedList<Integer> adj[];

	public TopologicalSortBFS(int v) {
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
	}

	public void print(LinkedList<Integer> adj[]) {
		for (int i = 0; i < adj.length; i++) {
			System.out.println(i + " -> " + adj[i]);
		}
	}

	public Queue<Integer> bfs(int indegree[]) {
		Queue<Integer> SortedQueue = new LinkedList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < adj.length; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}
		while (!q.isEmpty()) {
			int curr = q.poll();
			SortedQueue.add(curr);
			for (int neighbour : adj[curr]) {
				indegree[neighbour]--;
				if (indegree[neighbour] == 0)
					q.add(neighbour);
			}
		}
		return SortedQueue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		TopologicalSortBFS g = new TopologicalSortBFS(v);
		int indegree[] = new int[v];
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			indegree[destination]++;
			g.addEdge(source, destination);
		}
		g.print(adj);
		for (int i = 0; i < v; i++) {
			System.out.print(indegree[i] + " ");
		}
		System.out.println();
		Queue<Integer> SortedQueue = g.bfs(indegree);
		System.out.println(SortedQueue);

	}

}
