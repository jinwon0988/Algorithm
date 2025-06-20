import java.io.*;
import java.util.*;

public class Main {
	static long[][] DP;
	static ArrayList<Character> Path;
	static char[] A;
	static char[] B;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		A = br.readLine().toCharArray();
		B = br.readLine().toCharArray();
		DP = new long[A.length + 1][B.length + 1];
		Path = new ArrayList<Character>();
		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i - 1] == B[j - 1]) {
					DP[i][j] = DP[i - 1][j - 1] + 1;
				} else {
					DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
				}
			}
		}
		bw.write(DP[A.length][B.length] + "\n");
		getText(A.length, B.length);
		for (int i = Path.size() - 1; i >= 0; i--) {
			bw.write(Path.get(i));
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void getText(int r, int c) {
		if (r == 0 || c == 0)
			return;
		if (A[r - 1] == B[c - 1]) {
			Path.add(A[r - 1]);
			getText(r - 1, c - 1);
		} else {
			if (DP[r - 1][c] > DP[r][c - 1])
				getText(r - 1, c);
			else
				getText(r, c - 1);
		}
	}
}
