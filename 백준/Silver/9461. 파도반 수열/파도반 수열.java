import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long[] A = new long[101];
		A[1] = 1;
		A[2] = 1;
		A[3] = 1;
		A[4] = 2;
		A[5] = 2;
		for (int i = 6; i <= 100; i++) {
			A[i] = A[i - 1] + A[i - 5];
		}
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(A[N] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}