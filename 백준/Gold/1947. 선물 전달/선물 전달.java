import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long MOD = 1000000000;
		long[] D = new long[N + 1];
		D[1] = 0;
		if (N >= 2)
			D[2] = 1;
		for (int i = 3; i <= N; i++) {
			D[i] = (i - 1) * (D[i - 1] + D[i - 2]) % MOD;
		}
		bw.write(D[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
