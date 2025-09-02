import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int R = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}