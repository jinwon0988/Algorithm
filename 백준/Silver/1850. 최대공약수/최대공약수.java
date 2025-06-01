import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long one_count = gcd(A, B);
		for (long i = 0; i < one_count; i++) {
			bw.write(1 + "");
		}
		bw.flush();
		bw.close();
	}

	public static long gcd(long A, long B) {
		if (B == 0) {
			return A;
		}
		return gcd(B, A % B);
	}
}
