import java.io.*;
import java.util.*;

public class Main {
	static char[][] A;
	static boolean[][] visited;
	static int R, C;
	static int[] dr = { -1, 0, 1 };
	static int[] dc = { 1, 1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		A = new char[R][C];
		visited = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			String input = br.readLine();
			for (int j = 0; j < C; j++) {
				A[i][j] = input.charAt(j);
			}
		}
		int cnt = 0;
		for (int i = 0; i < R; i++) {
			if (dfs(i, 0))
				cnt++;
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static boolean dfs(int x, int y) {
		visited[x][y] = true;
		if (y == (C - 1))
			return true;
		for (int d = 0; d < 3; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];
			if (nr < 0 || nr >= R || nc < 0 || nc >= C)
				continue;
			if (A[nr][nc] == 'x' || visited[nr][nc])
				continue;
			if (dfs(nr, nc))
				return true;
		}
		return false;
	}
}