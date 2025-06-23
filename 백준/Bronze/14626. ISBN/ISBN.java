import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int index = -1;
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int weight = (i % 2 == 0) ? 1 : 3;
			if (ch == '*') {
				index = i;
			} else {
				sum += (int) (ch - '0') * weight;
			}
		}
		int w = (index % 2 == 0) ? 1 : 3;
		for (int i = 0; i <= 9; i++) {
			if ((sum + i * w) % 10 == 0) {
				bw.write(i + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
