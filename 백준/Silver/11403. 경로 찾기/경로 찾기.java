import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] distance = new int[N + 1][N + 1];
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				distance[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (distance[i][k] == 1 && distance[k][j] == 1)
						distance[i][j] = 1;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				bw.write(distance[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
