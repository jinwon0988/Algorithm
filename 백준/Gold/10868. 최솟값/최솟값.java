import java.io.*;
import java.util.*;

public class Main {
	static long[] tree;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int treeSize = 1;
		while (treeSize <= N) {
			treeSize *= 2;
		}
		treeSize *= 2;
		tree = new long[treeSize];
		int leftNodeStartIndex = treeSize / 2 - 1;
		for (int i = 0; i < tree.length; i++) {
			tree[i] = Integer.MAX_VALUE;
		}
		for (int i = leftNodeStartIndex + 1; i <= leftNodeStartIndex + N; i++) {
			tree[i] = Long.parseLong(br.readLine());
		}
		setTree(treeSize - 1);
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			s += leftNodeStartIndex;
			e += leftNodeStartIndex;
			bw.write(getMin(s, e) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static long getMin(int s, int e) {
		long min = Long.MAX_VALUE;
		while (s <= e) {
			if (s % 2 == 1) {
				min = Math.min(min, tree[s]);
				s++;
			}
			s /= 2;
			if (e % 2 == 0) {
				min = Math.min(min, tree[e]);
				e--;
			}
			e /= 2;
		}
		return min;
	}

	public static void setTree(int i) {
		while (i != 1) {
			if (tree[i / 2] > tree[i])
				tree[i / 2] = tree[i];
			i--;
		}
	}
}
