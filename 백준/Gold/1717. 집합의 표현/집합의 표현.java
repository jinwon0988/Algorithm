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
		parent = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int question = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (question == 0) {
				union(a, b);
			} else {
				boolean result = checkSame(a, b);
				if (result)
					bw.write("YES\n");
				else
					bw.write("NO\n");
			}
		}
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

	public static int find(int index) {
		if (index == parent[index]) {
			return index;
		} else {
			return parent[index] = find(parent[index]);
		}
	}

	public static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b)
			return true;
		else
			return false;
	}
}
