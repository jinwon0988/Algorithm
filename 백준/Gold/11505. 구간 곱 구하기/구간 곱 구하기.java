import java.io.*;
import java.util.*;

public class Main {
	static long[] tree;
	static int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int treeSize = 1;
		while (treeSize <= N) {
			treeSize *= 2;
		}
		treeSize *= 2;
		tree = new long[treeSize];
		int leftNodeStartIndex = treeSize / 2 - 1;
		for (int i = 0; i < tree.length; i++) {
			tree[i] = 1;
		}
		for (int i = leftNodeStartIndex + 1; i <= leftNodeStartIndex + N; i++) {
			tree[i] = Long.parseLong(br.readLine());
		}
		setTree(treeSize - 1);
		for (int i = 0; i < M + K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Integer.parseInt(st.nextToken());
			if (a == 1) {
				changeVal(b + leftNodeStartIndex, c);
			} else {
				b += leftNodeStartIndex;
				c += leftNodeStartIndex;
				bw.write(getMul(b, (int) c) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static long getMul(int s, int e) {
		long mul = 1;
		while (s <= e) {
			if (s % 2 == 1) {
				mul = (mul * tree[s]) % MOD;
				s++;
			}
			if (e % 2 == 0) {
				mul = (mul * tree[e]) % MOD;
				e--;
			}
			s /= 2;
			e /= 2;
		}
		return mul;
	}

	public static void changeVal(int index, long val) {
		tree[index] = val;
		while (index > 1) {
			index /= 2;
			tree[index] = (tree[index * 2] * tree[index * 2 + 1]) % MOD;
		}
	}

	public static void setTree(int i) {
		while (i != 1) {
			tree[i / 2] = (tree[i / 2] * tree[i]) % MOD;
			i--;
		}
	}
}
