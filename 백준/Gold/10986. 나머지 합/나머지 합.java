import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] S = new long[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}

		long res = 0;
		int remainder;
		long[] C = new long[M];
		for (int i = 1; i <= N; i++) {
			remainder = (int) (S[i] % M);
			if (remainder == 0) {
				res++;
			}
			C[remainder]++;
		}

		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				res += C[i] * (C[i] - 1) / 2;
			}
		}

		System.out.println(res);
	}
}