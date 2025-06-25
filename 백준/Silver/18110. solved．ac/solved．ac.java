import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(A);
		int ex = (int) Math.round(N * 0.15);
		int sum = 0;
		for (int i = ex; i < N - ex; i++) {
			sum += A[i];
		}
		int avg = (int) Math.round((double) sum / (N - 2.0 * ex));
		bw.write(avg + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}