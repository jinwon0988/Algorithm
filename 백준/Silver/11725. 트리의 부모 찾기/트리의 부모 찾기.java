import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int[] R;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		visited = new boolean[N + 1];
		R = new int[N + 1];
		StringTokenizer st;
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		dfs(1);
		for (int i = 2; i <= N; i++) {
			bw.write(R[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void dfs(int n) {
		visited[n] = true;
		for (int i : A[n]) {
			if (visited[i])
				continue;
			R[i] = n;
			dfs(i);
		}
	}
}