import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int y = Integer.parseInt(br.readLine());
		bw.write(y - 543 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
