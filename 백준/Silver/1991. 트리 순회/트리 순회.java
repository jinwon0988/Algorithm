import java.io.*;
import java.util.*;

public class Main {
	static int[][] tree;
	static BufferedWriter bw;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		tree = new int[26][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int node = st.nextToken().charAt(0) - 'A';
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			if (left == '.') {
				tree[node][0] = -1;
			} else {
				tree[node][0] = left - 'A';
			}
			if (right == '.') {
				tree[node][1] = -1;
			} else {
				tree[node][1] = right - 'A';
			}
		}
		preOrder(0);
		bw.write("\n");
		inOrder(0);
		bw.write("\n");
		postOrder(0);
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void preOrder(int now) throws Exception {
		if (now == -1)
			return;
		bw.write((char) (now + 'A'));
		preOrder(tree[now][0]);
		preOrder(tree[now][1]);
	}

	public static void inOrder(int now) throws Exception {
		if (now == -1)
			return;
		inOrder(tree[now][0]);
		bw.write((char) (now + 'A'));
		inOrder(tree[now][1]);
	}

	public static void postOrder(int now) throws Exception {
		if (now == -1)
			return;
		postOrder(tree[now][0]);
		postOrder(tree[now][1]);
		bw.write((char) (now + 'A'));
	}
}
