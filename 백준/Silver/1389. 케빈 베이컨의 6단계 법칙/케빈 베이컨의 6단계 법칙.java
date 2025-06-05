import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] distance = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j)
					distance[i][j] = 0;
				else
					distance[i][j] = 10000001;
			}
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			distance[s][e] = 1;
			distance[e][s] = 1;
		}
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (distance[i][j] > distance[i][k] + distance[k][j]) {
						distance[i][j] = distance[i][k] + distance[k][j];
					}
				}
			}
		}
		int min = 0;
		int result = 1;
		for (int i = 1; i <= N; i++) {
			min += distance[1][i];
		}
		for (int i = 2; i <= N; i++) {
			int temp = 0;
			for (int j = 1; j <= N; j++) {
				temp += distance[i][j];
			}
			if (min > temp) {
				min = temp;
				result = i;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
