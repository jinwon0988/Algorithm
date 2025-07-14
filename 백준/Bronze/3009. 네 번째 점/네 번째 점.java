import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] X = new int[3];
		int[] Y = new int[3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(X);
		Arrays.sort(Y);
		if (X[0] == X[1]) {
			bw.write(X[2] + " ");
		} else {
			bw.write(X[0] + " ");
		}
		if (Y[0] == Y[1]) {
			bw.write(Y[2] + "\n");
		} else {
			bw.write(Y[0] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}