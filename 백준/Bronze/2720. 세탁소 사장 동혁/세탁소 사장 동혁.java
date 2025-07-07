import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			bw.write((C / 25) + " ");
			C %= 25;
			bw.write((C / 10) + " ");
			C %= 10;
			bw.write((C / 5) + " ");
			C %= 5;
			bw.write(C + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}