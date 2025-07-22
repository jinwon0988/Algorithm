import java.io.*;

public class Main {
	static String[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new String[N][N * 2 - 1];
		star(0, N - 1, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 2 - 1; j++) {
				bw.write((A[i][j] == null) ? " " : "*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void star(int x, int y, int n) {
		if (n == 3) {
			A[x][y] = "*";
			A[x + 1][y - 1] = A[x + 1][y + 1] = "*";
			A[x + 2][y - 2] = A[x + 2][y - 1] = A[x + 2][y] = A[x + 2][y + 1] = A[x + 2][y + 2] = "*";
			return;
		}
		star(x, y, n / 2);
		star(x + n / 2, y - n / 2, n / 2);
		star(x + n / 2, y + n / 2, n / 2);
	}
}