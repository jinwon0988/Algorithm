import java.io.*;
import java.util.*;

public class Main {
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int[][] A;
	static int N;
	static ArrayList<Integer> R;
	static int m = 1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		A = new int[N][N];
		R = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				A[i][j] = (int) (input.charAt(j) - '0');
			}
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] == 1) {
					count++;
					bfs(i, j, count + 1);
				}
			}
		}
		bw.write(count + "\n");
		Collections.sort(R);
		for (int i = 0; i < R.size(); i++) {
			bw.write((R.get(i)) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void bfs(int x, int y, int g) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		A[x][y] = g;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int r = now[0];
			int c = now[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!check(nr, nc))
					continue;
				if (A[nr][nc] == 1) {
					A[nr][nc] = ++g;
					queue.offer(new int[] { nr, nc });
				}
			}
		}
		R.add(g - m);
		m++;
	}

	public static boolean check(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}
}