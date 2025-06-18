import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][][] D = new int[100001][5][5];
		int[][] mp = { { 0, 2, 2, 2, 2 }, { 2, 1, 3, 4, 3 }, { 2, 3, 1, 3, 4 }, { 2, 4, 3, 1, 3 }, { 2, 3, 4, 3, 1 } };
		for (int i = 0; i < 100001; i++)
			for (int j = 0; j < 5; j++)
				for (int k = 0; k < 5; k++)
					D[i][j][k] = 100001 * 4;
		D[0][0][0] = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = 0;
		while (true) {
			int n = Integer.parseInt(st.nextToken());
			if (n == 0)
				break;
			s++;
			for (int i = 0; i < 5; i++) {
				if (n == i)
					continue;
				for (int j = 0; j < 5; j++) {
					D[s][i][n] = Math.min(D[s][i][n], D[s - 1][i][j] + mp[j][n]);
				}
			}
			for (int i = 0; i < 5; i++) {
				if (n == i)
					continue;
				for (int j = 0; j < 5; j++) {
					D[s][n][i] = Math.min(D[s][n][i], D[s - 1][j][i] + mp[j][n]);
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				min = Math.min(min, D[s][i][j]);
			}
		}
		bw.write(min + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
