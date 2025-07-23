import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			bw.write("#" + tc + "\n");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < i + 1; j++) {
					bw.write(C(i, j) + " ");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static int C(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}
}