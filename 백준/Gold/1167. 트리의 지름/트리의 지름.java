import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Edge>[] A;
	static int[] distance;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Edge>();
		}
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			while (true) {
				int E = Integer.parseInt(st.nextToken());
				if (E == -1)
					break;
				int V = Integer.parseInt(st.nextToken());
				A[S].add(new Edge(E, V));
			}
		}
		distance = new int[N + 1];
		visited = new boolean[N + 1];
		BFS(1);
		int max = 1;
		for (int i = 2; i <= N; i++) {
			if (distance[max] < distance[i]) {
				max = i;
			}
		}
		distance = new int[N + 1];
		visited = new boolean[N + 1];
		BFS(max);
		Arrays.sort(distance);
		bw.write(distance[N] + "\n");
		bw.flush();
		bw.close();
	}

	public static class Edge {
		int e;
		int cost;

		public Edge(int e, int cost) {
			this.e = e;
			this.cost = cost;
		}
	}

	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int now_node = queue.poll();
			for (Edge i : A[now_node]) {
				if (!visited[i.e]) {
					visited[i.e] = true;
					queue.add(i.e);
					distance[i.e] = distance[now_node] + i.cost;
				}
			}
		}
	}
}
