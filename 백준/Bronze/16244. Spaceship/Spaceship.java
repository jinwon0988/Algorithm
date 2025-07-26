import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] A = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
			sum += A[i];
		}
		long last = sum / 2;
		boolean isUsed = false;
		for (int i = 0; i < N; i++) {
			if (!isUsed && A[i] == last) {
				isUsed = true;
				continue;
			}
			bw.write(A[i] + " ");
		}
		bw.write(last + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}