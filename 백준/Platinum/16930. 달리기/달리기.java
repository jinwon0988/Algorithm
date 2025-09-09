import java.io.*;
import java.util.*;

public class Main {
	static int[][] A;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N, M, K;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char ch = str.charAt(j);
				if (ch == '.')
					A[i][j] = 0;
				else
					A[i][j] = -1;
			}
		}
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()) - 1;
		int y1 = Integer.parseInt(st.nextToken()) - 1;
		int x2 = Integer.parseInt(st.nextToken()) - 1;
		int y2 = Integer.parseInt(st.nextToken()) - 1;
		bfs(x1, y1);
		int result = A[x2][y2] == 0 ? -1 : A[x2][y2];
		if (x1 == x2 && y1 == y2)
			result = 0;
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs(int x, int y) {
		ArrayDeque<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] { x, y, 0 });
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			int dist = now[2];
			for (int d = 0; d < 4; d++) {
				for (int step = 1; step <= K; step++) {
					int nr = r + dr[d] * step;
					int nc = c + dc[d] * step;
					if (nr < 0 || nr >= N || nc < 0 || nc >= M)
						break;
					if (A[nr][nc] == -1)
						break;
					if (A[nr][nc] != 0 && A[nr][nc] < dist + 1)
						break;
					if (A[nr][nc] == dist + 1)
						continue;
					A[nr][nc] = dist + 1;
					queue.offer(new int[] { nr, nc, A[nr][nc] });
				}
			}
		}
	}
}