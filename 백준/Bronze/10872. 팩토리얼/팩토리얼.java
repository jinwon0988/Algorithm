import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Long result = 1L;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		bw.write(result + "\n");
		bw.close();
		br.close();
	}
}