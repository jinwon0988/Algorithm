import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		st = new StringTokenizer(br.readLine());
		int relative = Integer.parseInt(st.nextToken());
		int absolute = Integer.parseInt(st.nextToken());
		int relative_result = N * relative / 100;
		int absolute_result = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (A[i] >= absolute) {
				absolute_result++;
			}
		}
		bw.write(relative_result + " " + absolute_result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}