import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		char[] A = br.readLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			int num = (int) (A[i] - '0');
			sum += num;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}