import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] A = new int[31];
		for (int i = 0; i < 28; i++) {
			A[Integer.parseInt(br.readLine())]++;
		}
		for (int i = 1; i <= 30; i++) {
			if (A[i] == 0)
				bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}