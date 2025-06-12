import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] D = new int[N + 2];
		int[] T = new int[N + 1];
		int[] P = new int[N + 1];
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = N; i > 0; i--) {
			if (i + T[i] > N + 1) {
				D[i] = D[i + 1];
			} else {
				D[i] = Math.max(D[i + 1], D[i + T[i]] + P[i]);
			}
		}
		bw.write(D[1] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
