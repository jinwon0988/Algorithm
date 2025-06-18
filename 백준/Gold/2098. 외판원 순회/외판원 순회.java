import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] W;
	static int[][] D;
	static final int INF = 1000000 * 16 + 1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		D = new int[N][1 << N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bw.write(tsp(0, 1) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int tsp(int c, int v) {
		if (v == (1 << N) - 1) {
			return W[c][0] == 0 ? INF : W[c][0];
		}
		if (D[c][v] != 0) {
			return D[c][v];
		}
		int min_val = INF;
		for (int i = 0; i < N; i++) {
			if ((v & (1 << i)) == 0 && W[c][i] != 0) {
				min_val = Math.min(min_val, tsp(i, (v | (1 << i))) + W[c][i]);
			}
		}
		D[c][v] = min_val;
		return D[c][v];
	}
}
