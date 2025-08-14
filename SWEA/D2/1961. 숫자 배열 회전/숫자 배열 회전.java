import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			bw.write("#" + t + "\n");
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--) {
					bw.write(A[j][i] + "");
				}
				bw.write(" ");
				for (int j = N - 1; j >= 0; j--) {
					bw.write(A[N - 1 - i][j] + "");
				}
				bw.write(" ");
				for (int j = 0; j < N; j++) {
					bw.write(A[j][N - 1 - i] + "");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}