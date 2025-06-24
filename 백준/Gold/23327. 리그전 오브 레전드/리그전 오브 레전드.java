import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		long[] mul = new long[N];
		long[] sum = new long[N];
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		mul[0] = 0;
		sum[0] = A[0];
		for (int i = 1; i < N; i++) {
			sum[i] = sum[i - 1] + A[i];
			for (int j = 0; j < i; j++) {
				mul[i] += A[j] * A[i];
			}
			mul[i] += mul[i - 1];
		}
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			if (s == 0) {
				bw.write(mul[e] + "\n");
			} else {
				long result = mul[e] - mul[s - 1] - sum[s - 1] * (sum[e] - sum[s - 1]);
				bw.write(result + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}