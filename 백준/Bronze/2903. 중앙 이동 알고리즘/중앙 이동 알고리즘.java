import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int temp = (int) (Math.pow(2, N) + 1);
		bw.write((temp * temp) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}