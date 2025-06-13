import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] scores = new int[N];
		for (int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		int max = scores[0];
		for (int i = 1; i < N; i++) {
			max = Math.max(max, scores[i]);
		}
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += (double) scores[i] / (double) max * 100.0;
		}
		double avg = sum / N;
		bw.write(avg + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
