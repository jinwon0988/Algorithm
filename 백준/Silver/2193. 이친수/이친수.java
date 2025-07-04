import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[][] D = new long[N + 1][2];
		D[1][1] = 1;
		D[1][0] = 0;
		for (int i = 2; i <= N; i++) {
			D[i][0] = D[i - 1][0] + D[i - 1][1];
			D[i][1] = D[i - 1][0];
		}
		bw.write(D[N][0] + D[N][1] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
