import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			bw.write(input + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}