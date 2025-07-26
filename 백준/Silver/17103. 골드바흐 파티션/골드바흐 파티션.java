import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int MAX = 1000000;
		boolean[] isPrime = new boolean[MAX + 1];
		for (int i = 2; i <= MAX; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i <= MAX; i++) {
			if (isPrime[i]) {
				for (int j = i + i; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 2; j <= N / 2; j++) {
				if (isPrime[j] && isPrime[N - j])
					count++;
			}
			bw.write(count + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}