import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int key = input[0] ^ 'C';
		for (int i = 0; i < input.length; i++) {
			bw.write((char) (input[i] ^ key) + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}