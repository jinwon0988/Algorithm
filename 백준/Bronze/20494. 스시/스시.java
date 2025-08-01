import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += br.readLine().length();
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}