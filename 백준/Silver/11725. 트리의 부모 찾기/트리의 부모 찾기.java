import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] tree;
	static int[] answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		visited = new boolean[N + 1];
		tree = new ArrayList[N + 1];
		answer = new int[N + 1];
		for (int i = 0; i < N+1; i++) {
			tree[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			tree[n1].add(n2);
			tree[n2].add(n1);
		}
		DFS(1);
		for (int i = 2; i <= N; i++) {
			bw.write(answer[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int node) {
		visited[node] = true;
		for (int i : tree[node]) {
			if (!visited[i]) {
				answer[i] = node;
				DFS(i);
			}
		}
	}
}
