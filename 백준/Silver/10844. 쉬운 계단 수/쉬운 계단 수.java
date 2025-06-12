import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[][] D = new long[N + 1][10];
		for (int i = 1; i <= 9; i++) {
			D[1][i] = 1;
		}
		long mod = 1000000000;
		for (int i = 2; i <= N; i++) {
			D[i][0] = D[i - 1][1];
			D[i][9] = D[i - 1][8];
			for (int j = 1; j <= 8; j++) {
				D[i][j] = (D[i - 1][j - 1] + D[i - 1][j + 1]) % mod;
			}
		}
		long sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = (sum + D[N][i]) % mod;
		}
		bw.write(sum + "\n");
		bw.close();
		br.close();
	}
}
