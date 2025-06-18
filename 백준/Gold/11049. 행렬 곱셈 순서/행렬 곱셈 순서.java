import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static Matrix[] M;
	static int[][] D;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		M = new Matrix[N + 1];
		D = new int[N + 1][N + 1];
		for (int i = 0; i < D.length; i++)
			for (int j = 0; j < D.length; j++)
				D[i][j] = -1;
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			M[i] = new Matrix(y, x);
		}
		bw.write(execute(1, N) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static int execute(int s, int e) {
		int result = Integer.MAX_VALUE;
		if (D[s][e] != -1)
			return D[s][e];
		if (s == e)
			return 0;
		if (s + 1 == e)
			return M[s].x * M[s].y * M[e].y;
		for (int i = s; i < e; i++) {
			int a = M[s].x * M[i].y * M[e].y;
			// D[s][e] = D[s][i] + D[i+1][e] + a;
			result = Math.min(result, execute(s, i) + execute(i + 1, e) + a);
		}
		return D[s][e] = result;
	}

	static class Matrix {
		private int x;
		private int y;

		Matrix(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
