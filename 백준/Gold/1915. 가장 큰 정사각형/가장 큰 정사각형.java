import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[][] D = new long[n][m];
		long max = 0;
		for (int i = 0; i < n; i++) {
			String mLine = br.readLine();
			for (int j = 0; j < m; j++) {
				D[i][j] = Long.parseLong(String.valueOf(mLine.charAt(j)));
				if (D[i][j] == 1 && i > 0 && j > 0) {
					D[i][j] = Math.min(D[i - 1][j - 1], Math.min(D[i - 1][j], D[i][j - 1])) + 1;
				}
				if (max < D[i][j]) {
					max = D[i][j];
				}
			}
		}
		bw.write(max * max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
