import java.io.*;
import java.util.*;

public class Main {
	static long lcm;
	static ArrayList<Node>[] A;
	static boolean[] visited;
	static long D[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new ArrayList[N];
		visited = new boolean[N];
		D = new long[N];
		lcm = 1;
		for (int i = 0; i < N; i++) {
			A[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			A[a].add(new Node(b, p, q));
			A[b].add(new Node(a, q, p));
			lcm *= (p * q / gcd(p, q));
		}
		D[0] = lcm;
		dfs(0);
		long mgcd = D[0];
		for (int i = 1; i < N; i++) {
			mgcd = gcd(mgcd, D[i]);
		}
		for (int i = 0; i < N; i++) {
			bw.write(D[i] / mgcd + " ");
		}
		bw.flush();
		bw.close();
	}

	public static class Node {
		int node;
		int p;
		int q;

		public Node(int node, int p, int q) {
			this.node = node;
			this.p = p;
			this.q = q;
		}
	}

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void dfs(int n) {
		visited[n] = true;
		for (Node no : A[n]) {
			int next = no.node;
			if (!visited[next]) {
				D[next] = D[n] * no.q / no.p;
				dfs(next);
			}
		}
	}
}
