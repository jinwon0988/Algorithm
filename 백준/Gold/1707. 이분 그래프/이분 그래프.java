import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] A;
	static int[] check;
	static boolean[] visited;
	static boolean IsEven;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			String[] s = br.readLine().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			A = new ArrayList[V + 1];
			visited = new boolean[V + 1];
			check = new int[V + 1];
			IsEven = true;
			for (int j = 0; j <= V; j++) {
				A[j] = new ArrayList<>();
			}
			for (int j = 0; j < E; j++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				A[start].add(end);
				A[end].add(start);
			}
			for (int j = 1; j <= V; j++) {
				if (IsEven) {
					DFS(j);
				} else {
					break;
				}
			}
			if (IsEven) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		bw.flush();
		bw.close();
	}

	public static void DFS(int node) {
		visited[node] = true;
		for (int i : A[node]) {
			if (!visited[i]) {
				check[i] = (check[node] + 1) % 2;
				DFS(i);
			} else if (check[node] == check[i]) {
				IsEven = false;
			}
		}
	}
}
