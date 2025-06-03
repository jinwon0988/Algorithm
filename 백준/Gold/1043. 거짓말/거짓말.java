import java.io.*;
import java.util.*;

public class Main {
	static int[] parent;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int know_count = Integer.parseInt(st.nextToken());
		int[] know = new int[know_count];
		for (int i = 0; i < know_count; i++) {
			know[i] = Integer.parseInt(st.nextToken());
		}
		ArrayList<Integer>[] party = new ArrayList[M];
		for (int i = 0; i < M; i++) {
			party[i] = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int party_size = Integer.parseInt(st.nextToken());
			for (int j = 0; j < party_size; j++) {
				party[i].add(Integer.parseInt(st.nextToken()));
			}
		}
		parent = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < M; i++) {
			int first = party[i].get(0);
			for (int j = 1; j < party[i].size(); j++) {
				union(first, party[i].get(j));
			}
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			int current = party[i].get(0);
			boolean isPossible = true;
			for (int j = 0; j < know.length; j++) {
				if (find(current) == find(know[j])) {
					isPossible = false;
					break;
				}
			}
			if (isPossible)
				count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
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
}
