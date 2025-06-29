import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[11];
		A[1] = 1;
		A[2] = 2;
		A[3] = 4;
		for (int i = 4; i < 11; i++) {
			A[i] = A[i - 1] + A[i - 2] + A[i - 3];
		}
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write(A[num] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}