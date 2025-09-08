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
		StringTokenizer st;
		A = new int[N][N];
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

	static void divide(int r, int c, int size) {
		if (isUniform(r, c, size)) {
			if (A[r][c] == 0)
				white++;
			else
				blue++;
			return;
		}
		int half = size / 2;
		divide(r, c, half);
		divide(r, c + half, half);
		divide(r + half, c, half);
		divide(r + half, c + half, half);
	}

	static boolean isUniform(int r, int c, int size) {
		int color = A[r][c];
		for (int i = r; i < r + size; i++) {
			for (int j = c; j < c + size; j++) {
				if (A[i][j] != color)
					return false;
			}
		}
		return true;
	}
}