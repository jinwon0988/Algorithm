import java.io.*;
import java.util.*;

public class Main {
	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int[][] A;
	static boolean[][] visited;
	static int w, h;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0)
				break;
			A = new int[h][w];
			visited = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j] && A[i][j] == 1) {
						cnt++;
						DFS(i, j);
					}
				}
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int r, int c) {
		visited[r][c] = true;
		for (int d = 0; d < 8; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (!check(nr, nc))
				continue;
			if (A[nr][nc] == 1 && !visited[nr][nc]) {
				visited[nr][nc] = true;
				DFS(nr, nc);
			}
		}
	}

	public static boolean check(int r, int c) {
		return r >= 0 && r < h && c >= 0 && c < w;
	}
}