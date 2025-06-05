import java.io.*;
import java.util.*;

public class Main {
	static int[] parent;
	static PriorityQueue<lEdge> pq;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		pq = new PriorityQueue<>();
		StringTokenizer st;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char[] tempc = st.nextToken().toCharArray();
			for (int j = 0; j < N; j++) {
				int temp = 0;
				if (tempc[j] >= 'a' && tempc[j] <= 'z')
					temp = tempc[j] - 'a' + 1;
				else if (tempc[j] >= 'A' && tempc[j] <= 'Z')
					temp = tempc[j] - 'A' + 27;
				sum += temp;
				if (i != j && temp != 0)
					pq.add(new lEdge(i, j, temp));
			}
		}
		parent = new int[N];
		for (int i = 0; i < N; i++)
			parent[i] = i;
		int useEdge = 0;
		int result = 0;
		while (!pq.isEmpty()) {
			lEdge now = pq.poll();
			if (find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result += now.v;
				useEdge++;
			}
		}
		if (useEdge == N - 1)
			bw.write(sum - result + "\n");
		else
			bw.write(-1 + "\n");
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

	public static class lEdge implements Comparable<lEdge> {
		int s, e, v;

		public lEdge(int s, int e, int v) {
			this.s = s;
			this.e = e;
			this.v = v;
		}

		@Override
		public int compareTo(lEdge o) {
			return this.v - o.v;
		}
	}
}
