import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		char[] B = br.readLine().toCharArray();
		int res1 = A * Character.getNumericValue(B[2]);
		int res2 = A * Character.getNumericValue(B[1]);
		int res3 = A * Character.getNumericValue(B[0]);
		int result = res1 + res2 * 10 + res3 * 100;
		bw.write(res1 + "\n");
		bw.write(res2 + "\n");
		bw.write(res3 + "\n");
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
