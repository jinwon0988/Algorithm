import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str_input = br.readLine().split(" ");
		int A = Integer.parseInt(str_input[0]);
		int B = Integer.parseInt(str_input[1]);
		long gcd = gcd(A, B);
		long lcm = A * B / gcd;
		bw.write(gcd + "\n");
		bw.write(lcm + "\n");
		bw.flush();
		bw.close();
	}

	public static long gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
