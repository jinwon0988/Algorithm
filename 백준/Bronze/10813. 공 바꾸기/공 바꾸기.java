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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int temp = A[a];
			A[a] = A[b];
			A[b] = temp;
		}
		for (int i = 1; i <= N; i++) {
			bw.write(A[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}