import java.io.*;
import java.util.*;

public class Main {
	static int[][] A;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int cheese;
	static int X, Y;

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
		int cnt = 0;
		cheese = 0;
		while (true) {
			visited = new boolean[X][Y];
			int count = BFS(0, 0);
			if (count == 0)
				break;
			cnt++;
			cheese = count;
		}
		bw.write(cnt + "\n");
		bw.write(cheese + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.offer(new int[] { x, y });
		int count = 0;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!check(nr, nc) || visited[nr][nc])
					continue;
				if (A[nr][nc] == 1) {
					A[nr][nc] = 0;
					count++;
					visited[nr][nc] = true;
					continue;
				}
				visited[nr][nc] = true;
				queue.add(new int[] { nr, nc });
			}
		}
		return count;
	}

	public static boolean check(int r, int c) {
		return r >= 0 && r < X && c >= 0 && c < Y;
	}
}