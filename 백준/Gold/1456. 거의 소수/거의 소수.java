import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long[] prime = new long[10000001];
		for (int i = 2; i < 10000001; i++) {
			prime[i] = i;
		}
		for (int i = 2; i <= Math.sqrt(10000001); i++) {
			if (prime[i] != 0) {
				for (int j = i + i; j < 10000001; j += i) {
					prime[j] = 0;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < 10000001; i++) {
			if (prime[i] != 0) {
				long temp = prime[i];
				while ((double) prime[i] <= (double) B / (double) temp) {
					if ((double) prime[i] >= (double) A / (double) temp) {
						count++;
					}
					temp = temp * prime[i];
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
