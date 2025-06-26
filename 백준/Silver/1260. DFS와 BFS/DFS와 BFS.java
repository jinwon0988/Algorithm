import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static ArrayList<Integer>[] A;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		DFS(V);
		bw.write("\n");
		visited = new boolean[N + 1];
		BFS(V);
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int node) throws Exception {
		bw.write(node + " ");
		visited[node] = true;
		for (int i : A[node]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}

	public static void BFS(int node) throws Exception {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int now = queue.poll();
			bw.write(now + " ");
			for (int i : A[now]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}