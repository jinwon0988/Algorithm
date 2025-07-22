import java.io.*;

public class Main {
	static String[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new String[N][N];
		star(0, 0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write((A[i][j] == null) ? " " : "*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void star(int x, int y, int n) {
		if (n == 1) {
			A[x][y] = "*";
			return;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					star(x + i * n / 3, y + j * n / 3, n / 3);
				}
			}
		}
	}
}