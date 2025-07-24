import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			long[][] A = new long[N + 1][N + 1];
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= N; j++) {
					A[i][j] = Long.parseLong(st.nextToken()) + A[i - 1][j] + A[i][j - 1] - A[i - 1][j - 1];
				}
			}
			long max = 0;
			for (int i = M; i <= N; i++) {
				for (int j = M; j <= N; j++) {
					long sum = A[i][j] - A[i - M][j] - A[i][j - M] + A[i - M][j - M];
					max = Math.max(max, sum);
				}
			}
			bw.write("#" + tc + " " + max + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}