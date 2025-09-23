import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			while (s < e) {
				int temp = A[s];
				A[s] = A[e];
				A[e] = temp;
				s++;
				e--;
			}
		}
		for (int i = 1; i <= N; i++) {
			bw.write(A[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
	}
}