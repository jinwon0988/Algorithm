import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] A = new int[T][2];
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int resX = 0;
		int resY = 0;
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < T; j++) {
				int x = A[i][0];
				int y = A[j][1];

				if (x + K > N)
					x = N - K;
				if (y + K > M)
					y = M - K;

				int cnt = 0;
				int x2 = x + K;
				int y2 = y + K;
				for (int k = 0; k < T; k++) {
					int px = A[k][0];
					int py = A[k][1];
					if (x <= px && px <= x2 && y <= py && py <= y2)
						cnt++;
				}
				if (cnt > max) {
					max = cnt;
					resX = x;
					resY = y + K;
				}
			}
		}
		bw.write(resX + " " + resY + "\n");
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}