import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			bw.write(s.charAt(0) + "" + s.charAt(s.length() - 1) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}