import java.util.*;

public class Solution {
	static int[][] visited; // 0: 방문안함, 1: 방문함, 장애물, 2: 소용돌이(3배수로 진입 가능)
	static int[][] A;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			A = new int[N][N];
			visited = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					visited[i][j] = sc.nextInt();
				}
			}
			int[] S = new int[2];
			S[0] = sc.nextInt();
			S[1] = sc.nextInt();
			int[] E = new int[2];
			E[0] = sc.nextInt();
			E[1] = sc.nextInt();
			BFS(S, E);
			if (A[E[0]][E[1]] == 0)
				A[E[0]][E[1]] = -1;
			System.out.println("#" + test_case + " " + A[E[0]][E[1]]);
		}
		sc.close();
	}

	public static void BFS(int[] S, int[] E) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(S);
		visited[S[0]][S[1]] = 1;
		int time = 0;
		while (!queue.isEmpty()) {
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				int[] now = queue.poll();
				int r = now[0];
				int c = now[1];
				if (time != 0 && visited[r][c] == 2 && time % 3 != 0) {
					queue.add(now);
					continue;
				}
				for (int j = 0; j < 4; j++) {
					int nr = r + dr[j];
					int nc = c + dc[j];
					if (nr < 0 || nr >= N || nc < 0 || nc >= N)
						continue;
					if (visited[nr][nc] == 0) {
						visited[nr][nc] = 1;
						queue.add(new int[] { nr, nc });
						A[nr][nc] = time + 1;
						if (nr == E[0] && nc == E[1])
							return;
					} else if (visited[nr][nc] == 2) {
						queue.add(new int[] { nr, nc });
						A[nr][nc] = time + 1;
						while (A[nr][nc] % 3 != 0)
							A[nr][nc]++;
					}
				}
			}
			time++;
		}
	}
}