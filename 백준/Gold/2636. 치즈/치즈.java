import java.io.*;
import java.util.*;

public class Main {
	static int[][] A;
	static boolean[][] visited;
	static int X;
	static int Y;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		A = new int[X][Y];
		for (int i = 0; i < X; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < Y; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int count = 0;
		int ccount = 0;
		int rcount = 0;
		while (true) {
			visited = new boolean[X][Y];
			ccount = bfs(0, 0);
			if (ccount == 0)
				break;
			rcount = ccount;
			count++;
		}
		bw.write(count + "\n");
		bw.write(rcount + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int bfs(int x, int y) {
		int count = 0;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!check(nr, nc))
					continue;
				if (visited[nr][nc])
					continue;
				if (A[nr][nc] == 1) {
					A[nr][nc] = 0;
					visited[nr][nc] = true;
					count++;
				} else {
					queue.offer(new int[] { nr, nc });
					visited[nr][nc] = true;
				}
			}
		}
		return count;
	}

	public static boolean check(int r, int c) {
		return r >= 0 && r < X && c >= 0 && c < Y;
	}
}