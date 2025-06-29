import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[41];
		A[0] = 0;
		A[1] = 1;
		for (int i = 2; i <= 40; i++) {
			A[i] = A[i - 1] + A[i - 2];
		}
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				bw.write("1 0\n");
			} else {
				bw.write(A[num - 1] + " " + A[num] + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}