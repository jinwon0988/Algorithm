import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] pow = new long[N + 1];
		long[] sum = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			long num = Long.parseLong(br.readLine());
			pow[i] = pow[i - 1] + num * num;
			sum[i] = sum[i - 1] + num;
		}
		long max = 0;
		for (int i = 1; i <= N; i++) {
			max = Math.max(max, pow[i] * (sum[N] - sum[i]));
		}
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}