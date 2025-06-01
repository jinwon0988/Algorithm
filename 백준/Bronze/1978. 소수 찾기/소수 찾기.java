import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] prime = new int[1001];
		for (int i = 2; i <= 1000; i++) {
			prime[i] = i;
		}
		for (int i = 2; i <= Math.sqrt(1000); i++) {
			if (prime[i] != 0) {
				for (int j = i + i; j <= 1000; j += i) {
					prime[j] = 0;
				}
			}
		}
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (prime[Integer.parseInt(st.nextToken())] != 0)
				count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
