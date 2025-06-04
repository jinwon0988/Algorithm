import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		int[] distance = new int[V + 1];
		for (int i = 0; i <= V; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		boolean[] visited = new boolean[V + 1];
		ArrayList<Edge>[] edgeList = new ArrayList[V + 1];
		for (int i = 0; i <= V; i++) {
			edgeList[i] = new ArrayList<>();
		}
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			edgeList[u].add(new Edge(v, w));
		}
		pq.add(new Edge(K, 0));
		distance[K] = 0;
		while (!pq.isEmpty()) {
			Edge current = pq.poll();
			int c_v = current.vertex;
			if (visited[c_v])
				continue;
			visited[c_v] = true;
			for (Edge tmp : edgeList[c_v]) {
				int next = tmp.vertex;
				int value = tmp.value;
				if (distance[next] > distance[c_v] + value) {
					distance[next] = distance[c_v] + value;
					pq.add(new Edge(next, distance[next]));
				}
			}
		}
		for (int i = 1; i <= V; i++) {
			if (visited[i])
				bw.write(distance[i] + "\n");
			else
				bw.write("INF\n");
		}
		bw.flush();
		bw.close();
	}
}

class Edge implements Comparable<Edge> {
	int vertex, value;

	Edge(int vertex, int value) {
		this.vertex = vertex;
		this.value = value;
	}

	public int compareTo(Edge e) {
		if (this.value > e.value)
			return 1;
		else
			return -1;
	}
}