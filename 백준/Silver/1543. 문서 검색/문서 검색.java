import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String key = br.readLine();
		int count = 0;
		while (input.contains(key)) {
			input = input.replaceFirst(key, " ");
			count++;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}