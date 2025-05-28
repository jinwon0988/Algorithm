import java.io.*;
import java.util.*;

public class Main {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static BufferedWriter bw;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
			A[E].add(S);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		visited = new boolean[N + 1];
		DFS(V);
		bw.write("\n");
		bw.flush();
		visited = new boolean[N + 1];
		BFS(V);
		bw.flush();
		bw.close();
	}

	private static void DFS(int Node) throws Exception {
		bw.write(Node + " ");
		visited[Node] = true;
		for (int i : A[Node]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}

	private static void BFS(int Node) throws Exception {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			bw.write(now_Node + " ");
			for (int i : A[now_Node]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
