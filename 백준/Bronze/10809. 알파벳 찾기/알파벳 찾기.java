import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] alpha = new int[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = -1;
		}
		String S = br.readLine();
		for (int i = 0; i < S.length(); i++) {
			int al = S.charAt(i) - 'a';
			if (alpha[al] == -1)
				alpha[al] = i;
		}
		for (int i = 0; i < 26; i++) {
			bw.write(alpha[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
