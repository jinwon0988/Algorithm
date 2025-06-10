import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		long[][] D = new long[N + M + 1][N + M + 1];
		for (int i = 0; i <= N + M; i++) {
			D[i][1] = i;
			D[i][0] = 1;
			D[i][i] = 1;
		}
		for (int i = 2; i <= N + M; i++) {
			for (int j = 2; j < i; j++) {
				D[i][j] = D[i - 1][j - 1] + D[i - 1][j];
				if (D[i][j] > 1000000000)
					D[i][j] = 1000000001;
			}
		}
		if (D[N + M][M] < K)
			bw.write(-1 + "\n");
		else {
			while (!(N == 0 && M == 0)) {
				if (D[N + M - 1][M] >= K) {
					bw.write("a");
					N--;
				} else {
					bw.write("z");
					K -= D[N + M - 1][M];
					M--;
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
