import java.io.*;
import java.util.*;

public class Solution {
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] A = new char[H + 2][W + 2];
			for (int i = 0; i < H + 2; i++) {
				for (int j = 0; j < W + 2; j++) {
					if (i == 0 || i == H + 1 || j == 0 || j == W + 1)
						A[i][j] = '#';
				}
			}
			int r = 0, c = 0;
			for (int i = 1; i <= H; i++) {
				String str = br.readLine();
				for (int j = 1; j <= W; j++) {
					A[i][j] = str.charAt(j - 1);
					if (A[i][j] == '^' || A[i][j] == 'v' || A[i][j] == '<' || A[i][j] == '>') {
						r = i;
						c = j;
					}
				}
			}
			int N = Integer.parseInt(br.readLine());
			String commands = br.readLine();
			for (int i = 0; i < N; i++) {
				char command = commands.charAt(i);
				int m;
				if (command == 'U')
					m = 0;
				else if (command == 'R')
					m = 1;
				else if (command == 'D')
					m = 2;
				else if (command == 'L')
					m = 3;
				else
					m = 4;
				if (m == 4) {
					if (A[r][c] == '^')
						m = 0;
					else if (A[r][c] == '>')
						m = 1;
					else if (A[r][c] == 'v')
						m = 2;
					else
						m = 3;
					int count = 1;
					while (true) {
						if (A[r + dr[m] * count][c + dc[m] * count] == '*') {
							A[r + dr[m] * count][c + dc[m] * count] = '.';
							break;
						} else if (A[r + dr[m] * count][c + dc[m] * count] == '#') {
							break;
						}
						count++;
					}
				} else {
					if (m == 0)
						A[r][c] = '^';
					else if (m == 1)
						A[r][c] = '>';
					else if (m == 2)
						A[r][c] = 'v';
					else
						A[r][c] = '<';

					if (A[r + dr[m]][c + dc[m]] == '.') {
						A[r + dr[m]][c + dc[m]] = A[r][c];
						A[r][c] = '.';
						r += dr[m];
						c += dc[m];
					}
				}
			}
			bw.write("#" + tc + " ");
			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					bw.write(A[i][j]);
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}