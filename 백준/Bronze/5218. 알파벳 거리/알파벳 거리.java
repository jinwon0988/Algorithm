import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String X = st.nextToken();
			String Y = st.nextToken();
			bw.write("Distances: ");
			for (int j = 0; j < X.length(); j++) {
				if (X.charAt(j) <= Y.charAt(j)) {
					bw.write(Y.charAt(j) - X.charAt(j) + " ");
				} else {
					bw.write(Y.charAt(j) + 26 - X.charAt(j) + " ");
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}