import java.io.*;
import java.util.*;

public class Main {
	static int[][] A;
	static int K, W, H;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int[] hr = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int[] hc = { 1, 2, 2, 1, -1, -2, -2, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		A = new int[H][W];
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bw.write(bfs(0, 0) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int bfs(int x, int y) {
		Queue<int[]> queue = new ArrayDeque<>();
		boolean[][][] visited = new boolean[H][W][K + 1];
		queue.offer(new int[] { x, y, 0, 0 });
		visited[x][y][0] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			int horse = now[2];
			int move = now[3];
			if (r == H - 1 && c == W - 1)
				return move;
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr < 0 || nr >= H || nc < 0 || nc >= W)
					continue;
				if (visited[nr][nc][horse])
					continue;
				if (A[nr][nc] == 1)
					continue;
				visited[nr][nc][horse] = true;
				queue.offer(new int[] { nr, nc, horse, move + 1 });
			}
			if (horse < K) {
				for (int d = 0; d < 8; d++) {
					int nr = r + hr[d];
					int nc = c + hc[d];
					if (nr < 0 || nr >= H || nc < 0 || nc >= W)
						continue;
					if (visited[nr][nc][horse + 1])
						continue;
					if (A[nr][nc] == 1)
						continue;
					queue.offer(new int[] { nr, nc, horse + 1, move + 1 });
					visited[nr][nc][horse + 1] = true;
				}
			}
		}
		return -1;
	}
}