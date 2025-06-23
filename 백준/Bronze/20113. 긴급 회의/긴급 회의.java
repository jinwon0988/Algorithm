import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N + 1];
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num != 0)
				A[num]++;
		}
		int max = 1;
		for (int i = 2; i <= N; i++) {
			if (A[max] < A[i]) {
				max = i;
			}
		}
		Arrays.sort(A);
		if (A[N] == A[N - 1]) {
			bw.write("skipped\n");
		} else {
			bw.write(max + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}