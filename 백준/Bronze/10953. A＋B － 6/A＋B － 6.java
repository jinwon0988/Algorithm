import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] A = br.readLine().split(",");
			bw.write(Integer.parseInt(A[0]) + Integer.parseInt(A[1]) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}