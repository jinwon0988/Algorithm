import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] prime = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			prime[i] = i;
		}
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (prime[i] != 0) {
				for (int j = i + i; j <= N; j += i) {
					prime[j] = 0;
				}
			}
		}
		for (int i = M; i <= N; i++) {
			if (prime[i] != 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
