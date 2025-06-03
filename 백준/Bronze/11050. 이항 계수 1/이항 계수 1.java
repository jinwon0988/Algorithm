import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		if (K == 0) {
			bw.write(1 + "\n");
		} else {
			int denominator = N;
			int numerator = K;
			for (int i = 1; i < K; i++) {
				denominator *= (N - i);
			}
			for (int i = 1; i < K; i++) {
				numerator *= (K - i);
			}
			int result = denominator / numerator;
			bw.write(result + "\n");
		}
		bw.flush();
		bw.close();
	}
}
