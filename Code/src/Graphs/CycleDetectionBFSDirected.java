package Graphs;

import java.util.*;

//Using Topological Sorting
public class CycleDetectionBFSDirected {
	private static LinkedList<Integer> adj[];

	public CycleDetectionBFSDirected(int v) {
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

	public boolean bfs(int indegree[]) {
		int count = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < adj.length; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}
		while (!q.isEmpty()) {
			int curr = q.poll();
			count++;
			for (int neighbour : adj[curr]) {
				indegree[neighbour]--;
				if (indegree[neighbour] == 0)
					q.add(neighbour);
			}
		}
		return (adj.length != count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		CycleDetectionBFSDirected g = new CycleDetectionBFSDirected(v);
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
		boolean isCycle = g.bfs(indegree);
		System.out.println(isCycle);

	}

}
