import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0)
					sum -= i;
				else
					sum += i;
			}
			bw.write("#" + tc + " " + sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}