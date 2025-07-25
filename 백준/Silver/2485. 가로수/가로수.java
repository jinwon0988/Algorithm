import java.io.*;

public class Main {
	static String[][] A;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		A[0] = Integer.parseInt(br.readLine());
		A[1] = Integer.parseInt(br.readLine());
		int g = A[1] - A[0];
		for (int i = 2; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
			g = gcd(g, A[i] - A[i - 1]);
		}
		int count = 0;
		for (int i = 1; i < N;) {
			if (A[i] != A[i - 1] + g) {
				count++;
				A[i - 1] += g;
			} else {
				i++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}