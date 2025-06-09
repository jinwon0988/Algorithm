import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] tree;
	static int[] depth;
	static int kmax;
	static int[][] parent;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			tree[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			tree[s].add(e);
			tree[e].add(s);
		}
		depth = new int[N + 1];
		visited = new boolean[N + 1];
		int temp = 1;
		kmax = 0;
		while (temp <= N) {
			temp <<= 1;
			kmax++;
		}
		parent = new int[kmax + 1][N + 1];
		BFS(1);
		for (int k = 1; k <= kmax; k++) {
			for (int n = 1; n <= N; n++) {
				parent[k][n] = parent[k - 1][parent[k - 1][n]];
			}
		}
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int LCA = executeLCA(a, b);
			bw.write(LCA + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static int executeLCA(int a, int b) {
		if (depth[a] > depth[b]) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int k = kmax; k >= 0; k--) {
			if (Math.pow(2, k) <= depth[b] - depth[a]) {
				if (depth[a] <= depth[parent[k][b]]) {
					b = parent[k][b];
				}
			}
		}
		for (int k = kmax; k >= 0 && a != b; k--) {
			if (parent[k][a] != parent[k][b]) {
				a = parent[k][a];
				b = parent[k][b];
			}
		}
		int LCA = a;
		if (a != b) {
			LCA = parent[0][LCA];
		}
		return LCA;
	}

	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		int level = 1;
		int nowSize = 1;
		int count = 0;
		while (!queue.isEmpty()) {
			int nowNode = queue.poll();
			for (int next : tree[nowNode]) {
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
					parent[0][next] = nowNode;
					depth[next] = level;
				}
			}
			count++;
			if (count == nowSize) {
				count = 0;
				nowSize = queue.size();
				level++;
			}
		}
	}
}
