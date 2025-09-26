import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Edge>[] A;
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		distance = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			A[u].add(new Edge(v, w));
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		dijkstra(s);
		bw.write(distance[e] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dijkstra(int s) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		distance[s] = 0;
		pq.offer(new Edge(s, 0));
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
					pq.offer(new Edge(nv, distance[nv]));
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