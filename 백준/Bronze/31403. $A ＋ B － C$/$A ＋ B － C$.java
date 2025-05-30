import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		String B = br.readLine();
		int C = Integer.parseInt(br.readLine());
		bw.write(Integer.parseInt(A) + Integer.parseInt(B) - C + "\n");
		bw.write(Integer.parseInt(A + B) - C + "\n");
		bw.flush();
		bw.close();
	}
}
