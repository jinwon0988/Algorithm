import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[6];
		for (int i = 0; i < 6; i++)
			A[i] = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(br.readLine());
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int[] T = new int[3];
			for (int j = 0; j < 3; j++) {
				T[j] = Integer.parseInt(st.nextToken());
			}
			int[] K = new int[3];
			for (int j = 0; j < 3; j++) {
				K[j] = Math.abs(X - A[j * 2]) + Math.abs(Y - A[j * 2 + 1]);
			}
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < 3; j++) {
				int time = 0;
				if (T[j] < K[j])
					if (T[j] * (K[j] / T[j]) == K[j])
						time = T[j] * (K[j] / T[j]);
					else
						time = T[j] * (K[j] / T[j]) + T[j];
				else
					time = T[j];
				min = Math.min(min, time);
			}
			bw.write(min + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}