import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[5];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			if (Y <= 2) {
				A[0]++;
			} else if (Y <= 4) {
				if (S == 0)
					A[1]++;
				else
					A[2]++;
			} else {
				if (S == 0)
					A[3]++;
				else
					A[4]++;
			}
		}
		int room = 0;
		for (int i = 0; i < 5; i++) {
			room += A[i] / K + (A[i] % K == 0 ? 0 : 1);
		}
		bw.write(room + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}