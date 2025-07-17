import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = M - 1; j >= 0; j--) {
				bw.write(str.substring(j, j + 1));
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}