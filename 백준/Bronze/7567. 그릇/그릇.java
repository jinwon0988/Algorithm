import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		int sum = 10;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1))
				sum += 5;
			else
				sum += 10;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}