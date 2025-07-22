import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1 - i; j++)
				bw.write(" ");
			for (int j = 0; j < i * 2 + 1; j++)
				bw.write("*");
			bw.write("\n");
		}
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < i + 1; j++)
				bw.write(" ");
			for (int j = 0; j < (N - 1 - i) * 2 - 1; j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}