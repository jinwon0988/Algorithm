import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long[] A = new long[n + 1];
		A[0] = 1;
		A[1] = 1;
		for (int i = 2; i <= n; i++) {
			A[i] = (A[i - 1] + A[i - 2] * 2) % 10007;
		}
		bw.write(A[n] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}