import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		long start = 1;
		long end = K;
		while (start <= end) {
			long mid = (start + end) / 2;
			long count = 0;
			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			if (count < K)
				start = mid + 1;
			else
				end = mid - 1;
		}
		bw.write(start + "\n");
		bw.flush();
		bw.close();
	}
}
