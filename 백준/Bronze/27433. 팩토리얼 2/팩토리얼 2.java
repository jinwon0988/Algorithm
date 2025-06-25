import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long fact = 1;
		for (int i = 1; i <= N; i++) {
			fact *= i;
		}
		bw.write(fact + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}