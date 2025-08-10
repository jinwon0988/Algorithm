import java.io.*;
import java.util.*;

public class Main {
	static char[][] A;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		A = new char[12][6];
		for (int i = 0; i < 12; i++) {
			String input = br.readLine();
			for (int j = 0; j < 6; j++) {
				A[i][j] = input.charAt(j);
			}
		}
		int cnt = 0;
		while (true) {
			visited = new boolean[12][6];
			boolean isPopped = false;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if (A[i][j] == '.' || visited[i][j])
						continue;
					List<int[]> list = bfs(i, j);
					if (list.size() >= 4) {
						isPopped = true;
						for (int[] p : list)
							A[p[0]][p[1]] = '.';
					}
				}
			}
			if (!isPopped)
				break;
			gravity();
			cnt++;
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static List<int[]> bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.offer(new int[] { x, y });
		char color = A[x][y];
		List<int[]> list = new ArrayList<>();
		list.add(new int[] { x, y });
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr < 0 || nr >= 12 || nc < 0 || nc >= 6)
					continue;
				if (visited[nr][nc])
					continue;
				if (A[nr][nc] != color)
					continue;
				visited[nr][nc] = true;
				queue.offer(new int[] { nr, nc });
				list.add(new int[] { nr, nc });
			}
		}
		return list;
	}

	public static void gravity() {
		for (int i = 0; i < 6; i++) {
			int idx = 11;
			for (int j = 11; j >= 0; j--) {
				if (A[j][i] != '.') {
					A[idx][i] = A[j][i];
					if (idx != j)
						A[j][i] = '.';
					idx--;
				}
			}
		}
	}
}