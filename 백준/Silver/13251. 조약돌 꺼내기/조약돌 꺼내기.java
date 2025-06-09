import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int[] color = new int[M + 1];
		int N = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= M; i++) {
			color[i] = Integer.parseInt(st.nextToken());
			N += color[i];
		}
		int K = Integer.parseInt(br.readLine());
		double result = 0.0;
		for (int i = 1; i <= M; i++) {
			if (color[i] >= K) {
				double temp = 1.0;
				for (int j = 0; j < K; j++) {
					temp *= (color[i] - j) / (double) (N - j);
				}
				result += temp;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
