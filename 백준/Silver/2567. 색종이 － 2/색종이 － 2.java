import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		boolean[][] isPaper = new boolean[100][100];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = y; j < y + 10; j++) {
				for (int k = x; k < x + 10; k++) {
					isPaper[j][k] = true;
				}
			}
		}
		int perimeter = 0;
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				if (!isPaper[r][c])
					continue;
				for (int d = 0; d < 4; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					if (nr < 0 || nr >= 100 || nc < 0 || nc >= 100 || !isPaper[nr][nc])
						perimeter++;
				}
			}
		}
		bw.write(perimeter + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}