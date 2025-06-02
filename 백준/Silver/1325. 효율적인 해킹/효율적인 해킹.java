import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] A;
	static int[] answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visited = new boolean[N + 1];
		A = new ArrayList[N + 1];
		answer = new int[N + 1];
		for (int i = 0; i <= N; i++)
			A[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int E = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			A[S].add(E);
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++)
				visited[j] = false;
			BFS(i);
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			if (max < answer[i])
				max = answer[i];
		}
		for (int i = 1; i <= N; i++) {
			if (answer[i] == max)
				bw.write(i + " ");
		}
		bw.flush();
		bw.close();
	}

	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int now_node = queue.poll();
			for (int i : A[now_node]) {
				if (!visited[i]) {
					visited[i] = true;
					answer[node]++;
					queue.add(i);
				}
			}
		}
	}
}
