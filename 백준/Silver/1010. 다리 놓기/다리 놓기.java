import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[][] D = new int[30][30];
		for (int i = 0; i < 30; i++) {
			D[i][0] = 1;
			D[i][i] = 1;
			D[i][1] = i;
		}
		for (int i = 2; i < 30; i++) {
			for (int j = 2; j < i; j++) {
				D[i][j] = D[i - 1][j - 1] + D[i - 1][j];
			}
		}
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			bw.write(D[m][n] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
