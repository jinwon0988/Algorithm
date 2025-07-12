import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		for (int i = 1; i < N; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				sum += Math.abs(A[j] - Integer.parseInt(st.nextToken()));
			}
			if (sum > 2000)
				count++;
		}
		if ((N - 1) <= count * 2)
			bw.write("YES\n");
		else
			bw.write("NO\n");
		bw.flush();
		bw.close();
		br.close();
	}
}