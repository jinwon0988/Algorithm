import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int[] A = new int[10];
			for (int i = 0; i < 10; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);
			int sum = 0;
			for (int i = 1; i <= 8; i++) {
				sum += A[i];
			}
			double avg = (double) sum / 8.0;
			bw.write("#" + tc + " " + Math.round(avg) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}