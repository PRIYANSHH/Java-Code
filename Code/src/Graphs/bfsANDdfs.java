package Graphs;

import java.util.*;

public class bfsANDdfs {
	private static LinkedList<Integer> adj[];

	public bfsANDdfs(int v) {
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

	public int bfs(int source, int destination) {
		boolean visited[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		parent[source] = -1;
		visited[source] = true;
		q.add(source);
		int flag = 0;
		while (!q.isEmpty()) {
			int curr = q.poll();
			q1.add(curr);
			if (curr == destination)
				flag = 1;
			for (int neighbour : adj[curr]) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					q.add(neighbour);
					if (flag == 0)
						parent[neighbour] = curr;
				}
			}
		}
		System.out.println("BFS: " + q1);
		int curr = destination;
		int distance = 0;
		while (parent[curr] != -1) {
			System.out.print(curr + " -> ");
			curr = parent[curr];
			distance++;
		}
		System.out.println(source);
		return distance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		bfsANDdfs g = new bfsANDdfs(v);
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}
		g.print(adj);
		System.out.println("Enter source and destination: ");
		int distance = g.bfs(sc.nextInt(), sc.nextInt());
		System.out.println(distance);

	}

}
