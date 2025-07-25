import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] D = new int[N + 1];
		D[1] = 0;
		for (int i = 2; i <= N; i++) {
			D[i] = D[i - 1] + 1;
			if (i % 2 == 0)
				D[i] = Math.min(D[i], D[i / 2] + 1);
			if (i % 3 == 0)
				D[i] = Math.min(D[i], D[i / 3] + 1);
		}
		bw.write(D[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
