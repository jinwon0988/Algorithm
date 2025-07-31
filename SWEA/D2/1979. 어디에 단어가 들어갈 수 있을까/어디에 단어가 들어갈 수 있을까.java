import java.io.*;
import java.util.*;

public class Solution {
	static int[] dr = { 0, 1 };
	static int[] dc = { 1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int count = 0;
			for (int i = 0; i < N; i++) {
				int len = 0;
				for (int j = 0; j < N; j++) {
					if (A[i][j] == 1)
						len++;
					else {
						if (len == K) {
							count++;
							len = 0;
						} else
							len = 0;
					}
				}
				if (len == K)
					count++;
			}
			for (int i = 0; i < N; i++) {
				int len = 0;
				for (int j = 0; j < N; j++) {
					if (A[j][i] == 1)
						len++;
					else {
						if (len == K) {
							count++;
							len = 0;
						} else
							len = 0;
					}
				}
				if (len == K)
					count++;
			}
			bw.write("#" + tc + " " + count + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}