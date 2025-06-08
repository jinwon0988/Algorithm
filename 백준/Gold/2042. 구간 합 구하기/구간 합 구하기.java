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
		int K = Integer.parseInt(st.nextToken());
		int treeSize = 1;
		while (treeSize < N) {
			treeSize *= 2;
		}
		treeSize *= 2;
		int leftNodeStartIndex = treeSize / 2;
		tree = new long[treeSize];
		for (int i = leftNodeStartIndex; i < leftNodeStartIndex + N; i++) {
			tree[i] = Long.parseLong(br.readLine());
		}
		setTree(treeSize - 1);
		for (int i = 0; i < M + K; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			if (a == 1) {
				changeVal(leftNodeStartIndex + b - 1, c);
			} else {
				b += leftNodeStartIndex - 1;
				c += leftNodeStartIndex - 1;
				bw.write(getSum(b, (int) c) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static long getSum(int s, int e) {
		long sum = 0;
		while (s <= e) {
			if (s % 2 == 1) {
				sum += tree[s];
				s++;
			}
			if (e % 2 == 0) {
				sum += tree[e];
				e--;
			}
			s /= 2;
			e /= 2;
		}
		return sum;
	}

	public static void changeVal(int index, long val) {
		long diff = val - tree[index];
		while (index > 0) {
			tree[index] += diff;
			index /= 2;
		}
	}

	public static void setTree(int i) {
		while (i != 1) {
			tree[i / 2] += tree[i];
			i--;
		}
	}
}
