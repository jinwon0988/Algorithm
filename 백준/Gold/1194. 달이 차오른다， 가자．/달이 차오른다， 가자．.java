import java.io.*;
import java.util.*;

public class Main {
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N, M;
	static char[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new char[N][M];
		int sx = 0, sy = 0;
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				A[i][j] = input.charAt(j);
				if (A[i][j] == '0') {
					sx = i;
					sy = j;
				}
			}
		}
		bw.write(bfs(sx, sy) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new ArrayDeque<>();
		boolean[][][] visited = new boolean[N][M][64];
		queue.offer(new int[] { x, y, 0, 0 }); // x, y, key, move
		visited[x][y][0] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			int key = now[2];
			int move = now[3];
			if (A[r][c] == '1')
				return move;
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (A[nr][nc] == '#')
					continue;
				if (visited[nr][nc][key])
					continue;
				if (A[nr][nc] >= 'a' && A[nr][nc] <= 'f') {
					int nKey = 1 << (A[nr][nc] - 'a');
					nKey = key | nKey;
					visited[nr][nc][nKey] = true;
					queue.offer(new int[] { nr, nc, nKey, move + 1 });
				} else if (A[nr][nc] >= 'A' && A[nr][nc] <= 'F') {
					if ((1 << (A[nr][nc] - 'A') & key) != 0) {
						visited[nr][nc][key] = true;
						queue.offer(new int[] { nr, nc, key, move + 1 });
					}
				} else {
					visited[nr][nc][key] = true;
					queue.offer(new int[] { nr, nc, key, move + 1 });
				}
			}
		}
		return -1;
	}
}