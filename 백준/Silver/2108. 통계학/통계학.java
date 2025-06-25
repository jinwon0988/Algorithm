import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		long sum = 0;
		int[][] choi = new int[8001][2];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
			sum += A[i];
			choi[A[i] + 4000][0] = A[i];
			choi[A[i] + 4000][1]++;
		}
		bw.write(Math.round((double) sum / N) + "\n");
		Arrays.sort(A);
		bw.write(A[N / 2] + "\n");
		Arrays.sort(choi, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}
			return Integer.compare(o2[1], o1[1]);
		});
		if (choi[0][1] == choi[1][1]) {
			bw.write(choi[1][0] + "\n");
		} else {
			bw.write(choi[0][0] + "\n");
		}
		bw.write((A[N - 1] - A[0]) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}