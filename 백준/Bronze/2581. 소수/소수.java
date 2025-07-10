import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10001;
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
				sum += i;
				if (min > i)
					min = i;
			}
		}
		if (min == 10001)
			bw.write("-1\n");
		else {
			bw.write(sum + "\n");
			bw.write(min + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}