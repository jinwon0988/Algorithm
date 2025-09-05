import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[26];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				A[ch - 'A'] += (int) Math.pow(10, str.length() - j - 1);
			}
		}
		Arrays.sort(A);
		int result = 0;
		for (int i = 25; i >= 0; i--) {
			if (A[i] == 0)
				break;
			result += A[i] * (i - 16);
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}