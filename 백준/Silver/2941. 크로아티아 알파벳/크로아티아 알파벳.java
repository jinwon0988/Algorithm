import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int count = input.length;
		for (int i = 0; i < input.length; i++) {
			if (i == input.length - 1)
				break;
			if (input[i] == 'c' && (input[i + 1] == '=' || input[i + 1] == '-')) {
				count--;
				i++;
			} else if (input[i] == 'd') {
				if (i < input.length - 2 && input[i + 1] == 'z' && input[i + 2] == '=') {
					count -= 2;
					i += 2;
				} else if (input[i + 1] == '-') {
					count--;
					i++;
				}
			} else if (input[i] == 'l' && input[i + 1] == 'j') {
				count--;
				i++;
			} else if (input[i] == 'n' && input[i + 1] == 'j') {
				count--;
				i++;
			} else if (input[i] == 's' && input[i + 1] == '=') {
				count--;
				i++;
			} else if (input[i] == 'z' && input[i + 1] == '=') {
				count--;
				i++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}