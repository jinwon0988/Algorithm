import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n + 1];
		A[0] = 0;
		A[1] = 1;
		for (int i = 2; i <= n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, A[i - j * j]);
			}
			A[i] = min + 1;
		}
		bw.write(A[n] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}