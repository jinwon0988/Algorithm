import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = (N + 1) * 5 - 5;
		for (int i = N; i >= 2; i--) {
			result += (i * 3 - 4) % 45678;
			result = result % 45678;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}