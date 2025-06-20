import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long r = 1;
		long sum = 0;
		int MOD = 1234567891;
		for (int i = 0; i < L; i++) {
			sum += ((str.charAt(i) - 'a' + 1) * r) % MOD;
			r = (r * 31) % MOD;
		}
		bw.write(sum % MOD + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
