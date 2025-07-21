import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			bw.write("#" + tc + "\n");
			int direct = 0;
			int[][] A = new int[N + 2][N + 2];
			for (int i = 0; i < N + 2; i++) {
				for (int j = 0; j < N + 2; j++) {
					if (i == 0 || i == N + 1 || j == 0 || j == N + 1)
						A[i][j] = 1;
				}
			}
			int r = 1, c = 1;
			A[r][c] = 1;
			for (int i = 2; i <= N * N; i++) {
				if (direct == 0) { // 오른쪽
					if (A[r][c + 1] == 0) {
						A[r][c + 1] = i;
						c++;
					} else {
						direct = 1;
					}
				}
				if (direct == 1) { // 아래
					if (A[r + 1][c] == 0) {
						A[r + 1][c] = i;
						r++;
					} else {
						direct = 2;
					}
				}
				if (direct == 2) { // 왼쪽
					if (A[r][c - 1] == 0) {
						A[r][c - 1] = i;
						c--;
					} else {
						direct = 3;
					}
				}
				if (direct == 3) { // 위
					if (A[r - 1][c] == 0) {
						A[r - 1][c] = i;
						r--;
					} else {
						direct = 0;
						i--;
					}
				}
			}
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					bw.write(A[i][j] + " ");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}