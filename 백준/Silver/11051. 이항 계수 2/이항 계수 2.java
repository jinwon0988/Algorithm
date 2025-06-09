import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] D = new int[N + 1][N + 1];
		for (int i = 0; i <= N; i++) {
			D[i][1] = i;
			D[i][0] = 1;
			D[i][i] = 1;
		}
		int MOD = 10007;
		for (int i = 2; i <= N; i++) {
			for (int j = 2; j < i; j++) {
				D[i][j] = (D[i - 1][j - 1] + D[i - 1][j]) % MOD;
			}
		}
		bw.write(D[N][K] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
