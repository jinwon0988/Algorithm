import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = br.readLine().charAt(0);
		bw.write(input + "\n");
		bw.flush();
		bw.close();
	}
}
