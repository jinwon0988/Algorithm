import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		long sum = 0;
		for (int i = 1; i < N; i++) {
			sum += i;
		}
		bw.write(sum + "\n");
		bw.write("2\n");
		bw.close();
		br.close();
	}
}