import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static boolean arrive;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			A[i] = new ArrayList<>();
		}
		visited = new boolean[N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for (int i = 0; i < N; i++) {
			dfs(i, 1);
			if (arrive)
				break;
		}
		if (arrive)
			bw.write("1\n");
		else
			bw.write("0\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dfs(int node, int depth) {
		if (depth == 5) {
			arrive = true;
			return;
		}
		visited[node] = true;
		for (int i : A[node]) {
			if (visited[i])
				continue;
			dfs(i, depth + 1);
		}
		visited[node] = false;
	}
}