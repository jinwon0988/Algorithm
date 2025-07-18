import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] A = new long[N + 1];
		long sum = 1;
		for (int i = 3; i <= N; i++) {
			A[i] = A[i - 1] + sum;
			sum += i - 1;
		}
		bw.write(A[N] + "\n");
		bw.write("3\n");
		bw.close();
		br.close();
	}
}