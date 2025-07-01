import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] S = br.readLine().toCharArray();
		int zero = 0;
		int one = 0;
		if (S[0] == '0')
			zero++;
		else
			one++;
		for (int i = 1; i < S.length; i++) {
			if (S[i] == '0') {
				if (S[i - 1] != '0')
					zero++;
			} else {
				if (S[i - 1] != '1')
					one++;
			}
		}
		bw.write(Math.min(zero, one) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}