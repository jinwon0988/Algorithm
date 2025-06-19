import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] x = new long[N + 1];
		long[] y = new long[N + 1];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Long.parseLong(st.nextToken());
			y[i] = Long.parseLong(st.nextToken());
		}
		x[N] = x[0];
		y[N] = y[0];
		double result = 0.0;
		for (int i = 0; i < N; i++) {
			result += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
		}
		String answer = String.format("%.1f", Math.abs(result) / 2.0);
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
