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
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] A = new int[N][2];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int mid = Integer.parseInt(st.nextToken());
				int fin = Integer.parseInt(st.nextToken());
				int ass = Integer.parseInt(st.nextToken());
				A[i][0] = mid * 35 + fin * 45 + ass * 20;
				A[i][1] = i + 1;
			}
			Arrays.sort(A, (o1, o2) -> Integer.compare(o2[0], o1[0]));
			int order = 0;
			for (int i = 0; i < N; i++) {
				if (A[i][1] == K) {
					order = i + 1;
					break;
				}
			}
			double score = (double) order / N * 100.0;
			bw.write("#" + tc + " ");
			if (score <= 10.0)
				bw.write("A+\n");
			else if (score <= 20.0)
				bw.write("A0\n");
			else if (score <= 30.0)
				bw.write("A-\n");
			else if (score <= 40.0)
				bw.write("B+\n");
			else if (score <= 50.0)
				bw.write("B0\n");
			else if (score <= 60.0)
				bw.write("B-\n");
			else if (score <= 70.0)
				bw.write("C+\n");
			else if (score <= 80.0)
				bw.write("C0\n");
			else if (score <= 90.0)
				bw.write("C-\n");
			else
				bw.write("D0\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}