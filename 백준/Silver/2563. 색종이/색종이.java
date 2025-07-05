import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] A = new int[100][100];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					A[j][k] = 1;
				}
			}
		}
		int result = 0;
		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 100; j++)
				result += A[i][j];
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}