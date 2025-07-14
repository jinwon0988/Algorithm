import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			int[] A = new int[26];
			String input = br.readLine().toLowerCase();
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
					A[input.charAt(j) - 'a']++;
				}
			}
			Arrays.sort(A);
			bw.write("Case " + i + ": ");
			if (A[0] == 0) {
				bw.write("Not a pangram\n");
			} else {
				if (A[0] == 1)
					bw.write("Pangram!\n");
				else if (A[0] == 2)
					bw.write("Double pangram!!\n");
				else
					bw.write("Triple pangram!!!\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}