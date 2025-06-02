import java.io.*;
import java.util.*;

public class Main {
	static int[] visited;
	static ArrayList<Integer>[] A;
	static int N, M, K, X;
	static List<Integer> answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		A = new ArrayList[N + 1];
		answer = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
		}
		visited = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}
		BFS(X);
		for (int i = 0; i <= N; i++) {
			if (visited[i] == K) {
				answer.add(i);
			}
		}
		if (answer.isEmpty()) {
			bw.write(-1 + "\n");
		} else {
			for (int i : answer) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node]++;
		while (!queue.isEmpty()) {
			int now_node = queue.poll();
			for (int i : A[now_node]) {
				if (visited[i] == -1) {
					visited[i] = visited[now_node] + 1;
					queue.add(i);
				}
			}
		}
	}
}
