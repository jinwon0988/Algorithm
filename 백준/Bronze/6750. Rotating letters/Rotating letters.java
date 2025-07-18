import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String result = "YES";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != 'I' && ch != 'O' && ch != 'S' && ch != 'H' && ch != 'Z' && ch != 'X' && ch != 'N')
				result = "NO";
		}
		bw.write(result + "\n");
		bw.close();
		br.close();
	}
}