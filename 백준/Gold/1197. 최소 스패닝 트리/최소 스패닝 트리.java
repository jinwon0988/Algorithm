import java.io.*;
import java.util.*;

public class Main {
	static PriorityQueue<pEdge> pq;
	static int[] parent;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		pq = new PriorityQueue<>();
		parent = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			pq.add(new pEdge(s, e, v));
		}
		int useEdge = 0;
		int result = 0;
		while (useEdge < N - 1) {
			pEdge now = pq.poll();
			if (find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result += now.v;
				useEdge++;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			parent[b] = a;
		}
	}

	public static int find(int a) {
		if (a == parent[a]) {
			return a;
		} else {
			return parent[a] = find(parent[a]);
		}
	}

	public static class pEdge implements Comparable<pEdge> {
		int s;
		int e;
		int v;

		pEdge(int s, int e, int v) {
			this.s = s;
			this.e = e;
			this.v = v;
		}

		@Override
		public int compareTo(pEdge o) {
			return this.v - o.v;
		}
	}
}
