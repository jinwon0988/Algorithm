import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int result = 1, c = 26, d = 10;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 'd') {
				result *= d;
				d = 9;
				c = 26;
			} else {
				result *= c;
				c = 25;
				d = 10;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}