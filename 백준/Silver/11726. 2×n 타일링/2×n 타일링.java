import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] D = new long[1001];
		D[1] = 1;
		D[2] = 2;
		for (int i = 3; i <= N; i++) {
			D[i] = (D[i - 1] + D[i - 2]) % 10007;
		}
		bw.write(D[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
