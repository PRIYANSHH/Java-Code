package Codechef;

import java.util.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ddimmst {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

	static class Node {
		int vertex;
		int key;
	}

	static class comparator implements Comparator<Node> {

		@Override
		public int compare(Node node0, Node node1) {
			return node0.key - node1.key;
		}
	}

	static class comparat implements Comparator<Node> {

		@Override
		public int compare(Node node0, Node node1) {
			return node0.vertex - node1.vertex;
		}
	}

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int n = sc.nextInt();
		int d = sc.nextInt();
		int i, j, sum = 0;
		int a[][] = new int[n][d];
		for (i = 0; i < n; i++) {
			for (j = 0; j < d; j++)
				a[i][j] = sc.nextInt();
		}
		Node[] e = new Node[n];
		boolean mstSet[] = new boolean[n];
		for (i = 0; i < n; i++) {
			e[i] = new Node();
			e[i].key = Integer.MIN_VALUE;
			e[i].vertex = i;
		}
		e[0].key = 0;
		TreeSet<Node> queue = new TreeSet<Node>(new comparator());
		TreeSet<Node> queue1 = new TreeSet<Node>(new comparat());
		for (int o = 0; o < n; o++) {
			queue.add(e[o]);
			queue1.add(e[o]);
		}
		while (!queue.isEmpty()) {
			Node node = queue.pollLast();
			mstSet[node.vertex] = true;
			queue1.remove(e[node.vertex]);
			for (Node v : queue1) {
				sum = 0;
				if (mstSet[v.vertex] == false) {
					for (j = 0; j < d; j++)
						sum += Math.abs(((a[node.vertex][j] - a[v.vertex][j])));
					if (e[v.vertex].key < sum) {
						queue.remove(e[v.vertex]);
						e[v.vertex].key = sum;
						queue.add(e[v.vertex]);
					}
				}
			}
		}
		int tot = 0;
		for (i = 0; i < n; i++) {
			if (e[i].key > 0) {
				tot += e[i].key;
			}
		}
		System.out.println(tot);
		System.out.flush();
	}
}