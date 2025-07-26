import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int MAX = 246912;
		int[] prime = new int[MAX + 1];
		for (int i = 2; i <= MAX; i++) {
			prime[i] = i;
		}
		for (int i = 2; i * i <= MAX; i++) {
			if (prime[i] != 0) {
				for (int j = i + i; j <= MAX; j += i) {
					prime[j] = 0;
				}
			}
		}
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (prime[i] != 0)
					count++;
			}
			bw.write(count + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}