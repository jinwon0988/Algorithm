import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				result += (char) (input.charAt(i) - 'A' + 'a');
			} else {
				result += (char) (input.charAt(i) - 'a' + 'A');
			}
		}
		bw.write(result + "\n");
		bw.close();
		br.close();
	}
}