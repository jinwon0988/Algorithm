import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static BufferedWriter bw;
	static int[] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[M];
		DFS(1, 0);
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int s, int d) throws Exception {
		if (d == M) {
			for (int i : A) {
				bw.write(i + " ");
			}
			bw.write("\n");
			return;
		}
		for (int i = s; i <= N; i++) {
			A[d] = i;
			DFS(i + 1, d + 1);
		}
	}
}