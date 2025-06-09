import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[][] D = new int[15][15];
		for (int i = 0; i < 15; i++) {
			D[0][i] = i;
			D[i][1] = 1;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				D[i][j] = D[i][j - 1] + D[i - 1][j];
			}
		}
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(D[k][n] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
