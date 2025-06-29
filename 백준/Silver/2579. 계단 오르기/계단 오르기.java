import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] stair = new int[N + 1];
		int[] score = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		score[1] = stair[1];
		if (N >= 2) {
			score[2] = stair[1] + stair[2];
			for (int i = 3; i <= N; i++) {
				score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
			}
		}
		bw.write(score[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}