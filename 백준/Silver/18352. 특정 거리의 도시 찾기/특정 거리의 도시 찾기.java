import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static ArrayList<Integer> R;
	static int K;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		visited = new boolean[N + 1];
		R = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
		}
		bfs(X);
		if (R.size() == 0)
			bw.write("-1\n");
		else {
			Collections.sort(R);
			for (int i : R)
				bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void bfs(int n) {
		Queue<int[]> queue = new ArrayDeque<>();
		visited[n] = true;
		queue.add(new int[] { n, 0 });
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int v = now[0];
			int l = now[1];
			if (l == K) {
				R.add(v);
				continue;
			}
			for (int i : A[v]) {
				if (visited[i])
					continue;
				visited[i] = true;
				queue.add(new int[] { i, l + 1 });
			}
		}
	}
}