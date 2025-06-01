import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		long result = n;
		for (long p = 2; p <= Math.sqrt(n); p++) {
			if (n % p == 0) {
				result = result - result / p;
				while (n % p == 0) {
					n = n / p;
				}
			}
		}
		if (n > 1) {
			result = result - result / n;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
