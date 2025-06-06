import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] tree;
	static boolean[] visited;
	static int answer = 0;
	static int deletedNode = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			tree[i] = new ArrayList<>();
		}
		visited = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int root = 0;
		for (int i = 0; i < N; i++) {
			int p = Integer.parseInt(st.nextToken());
			if (p != -1) {
				tree[i].add(p);
				tree[p].add(i);
			} else {
				root = i;
			}
		}
		deletedNode = Integer.parseInt(br.readLine());
		if (deletedNode == root) {
			bw.write(0 + "\n");
		} else {
			DFS(root);
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int node) {
		visited[node] = true;
		boolean leafNode = true;
		for (int i : tree[node]) {
			if (!visited[i] && i != deletedNode) {
				leafNode = false;
				DFS(i);
			}
		}
		if (leafNode) {
			answer++;
		}
	}
}
