import java.io.*;
import java.util.*;

public class Main {
	static int[][] A;
	static int white;
	static int blue;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		white = 0;
		blue = 0;
		divide(0, 0, N);
		bw.write(white + "\n");
		bw.write(blue + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static void divide(int x, int y, int size) {
		if (isUniformed(x, y, size)) {
			if (A[x][y] == 0)
				white++;
			else
				blue++;
			return;
		}
		int half = size / 2;
		divide(x, y, half);
		divide(x, y + half, half);
		divide(x + half, y, half);
		divide(x + half, y + half, half);
	}

	static boolean isUniformed(int x, int y, int size) {
		int color = A[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (A[i][j] != color)
					return false;
			}
		}
		return true;
	}
}