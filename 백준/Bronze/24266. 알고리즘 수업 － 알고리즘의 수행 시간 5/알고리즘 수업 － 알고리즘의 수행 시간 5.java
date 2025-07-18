import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		bw.write(N * N * N + "\n");
		bw.write("3\n");
		bw.close();
		br.close();
	}
}