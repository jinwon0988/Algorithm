import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= 9; i++) {
			bw.write(N + " * " + i + " = " + (N * i) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
