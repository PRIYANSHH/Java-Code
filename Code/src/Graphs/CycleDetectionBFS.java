package Graphs;

import java.util.*;

public class CycleDetectionBFS {
	private static LinkedList<Integer> adj[];

	public CycleDetectionBFS(int v) {
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

	public boolean bfs(int source) {
		int notvisited[] = new int[adj.length];
		int inqueue[] = new int[adj.length];
		int visited[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);
		inqueue[source] = 1;
		while (!q.isEmpty()) {
			int curr = q.poll();
			inqueue[curr] = 0;
			visited[curr] = 1;
			for (int neighbour : adj[curr]) {
				if (inqueue[neighbour] == 1)
					return true;
				if (visited[neighbour] != 1) {
					q.add(neighbour);
					inqueue[neighbour] = 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		CycleDetectionBFS g = new CycleDetectionBFS(v);
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}
		g.print(adj);
		boolean isCycle = g.bfs(0);
		System.out.println(isCycle);

	}

}
