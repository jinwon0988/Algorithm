import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Edge>[] A;
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		A = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++) {
			A[i] = new ArrayList<>();
		}
		distance = new int[V + 1];
		visited = new boolean[V + 1];
		for (int i = 0; i <= V; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			A[u].add(new Edge(v, w));
		}
		dijkstra(K);
		for (int i = 1; i <= V; i++) {
			if (visited[i])
				bw.write(distance[i] + "\n");
			else
				bw.write("INF\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dijkstra(int K) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		distance[K] = 0;
		pq.offer(new Edge(K, 0));
		while (!pq.isEmpty()) {
			Edge now = pq.poll();
			int v = now.v;
			if (visited[v])
				continue;
			visited[v] = true;
			for (Edge e : A[v]) {
				int nv = e.v;
				int nw = e.w;
				if (distance[nv] > distance[v] + nw) {
					distance[nv] = distance[v] + nw;
					pq.add(new Edge(nv, distance[nv]));
				}
			}
		}
	}

	static class Edge implements Comparable<Edge> {
		int v;
		int w;

		Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.w, o.w);
		}
	}
}