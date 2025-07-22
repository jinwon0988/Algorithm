import java.io.*;

public class Main {
	static String[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int r = (int) Math.pow(2, N) - 1;
		int c = r * 2 - 1;
		A = new String[r][c];
		int x = 0, y = 0;
		for (int i = N; i >= 1; i--) {
			if (i % 2 == 0) {
				invertedTriangle(i, x, y);
				x++;
			} else {
				triangle(i, x, y);
				x += ((int) Math.pow(2, i) - 1) / 2;
			}
			y += 1 << (i - 1);
		}
		if (N % 2 == 0) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c - i; j++) {
					bw.write(A[i][j] == null ? " " : "*");
				}
				bw.write("\n");
			}
		} else {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c / 2 + i + 1; j++) {
					bw.write(A[i][j] == null ? " " : "*");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void triangle(int n, int x, int y) {
		int r = (int) Math.pow(2, n) - 1;
		int c = r * 2 - 1;
		for (int i = x; i < x + r - 1; i++) {
			A[i][y + c / 2 - (i - x)] = "*";
			A[i][y + c / 2 + (i - x)] = "*";
		}
		for (int i = y; i < y + c; i++) {
			A[x + r - 1][i] = "*";
		}
	}

	public static void invertedTriangle(int n, int x, int y) {
		int r = (int) Math.pow(2, n) - 1;
		int c = r * 2 - 1;
		for (int i = y; i < y + c; i++) {
			A[x][i] = "*";
		}
		for (int i = x + 1; i < x + r; i++) {
			A[i][y + (i - x)] = "*";
			A[i][y + c - (i - x) - 1] = "*";
		}
	}
}