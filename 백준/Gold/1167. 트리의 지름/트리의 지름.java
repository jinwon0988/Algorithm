import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Edge>[] A;
	static boolean[] visited;
	static int[] distance;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int V = Integer.parseInt(br.readLine());
		A = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++) {
			A[i] = new ArrayList<>();
		}
		visited = new boolean[V + 1];
		distance = new int[V + 1];
		StringTokenizer st;
		for (int i = 0; i < V; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			while (true) {
				int e = Integer.parseInt(st.nextToken());
				if (e == -1)
					break;
				int v = Integer.parseInt(st.nextToken());
				A[s].add(new Edge(e, v));
			}
		}
		bfs(1);
		int max = 1;
		for (int i = 2; i <= V; i++) {
			if (distance[max] < distance[i])
				max = i;
		}
		visited = new boolean[V + 1];
		distance = new int[V + 1];
		bfs(max);
		max = distance[1];
		for (int i = 2; i <= V; i++) {
			if (max < distance[i])
				max = distance[i];
		}
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void bfs(int node) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (Edge i : A[now]) {
				int n = i.node;
				int v = i.value;
				if (visited[n])
					continue;
				visited[n] = true;
				distance[n] = distance[now] + v;
				queue.offer(n);
			}
		}
	}

	static class Edge {
		int node;
		int value;

		Edge(int node, int value) {
			this.node = node;
			this.value = value;
		}
	}
}