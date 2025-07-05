import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[][] A = new String[5][15];
		for (int i = 0; i < 5; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < input.length; j++) {
				A[i][j] = input[j];
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (A[j][i] != null && !A[j][i].isEmpty())
					bw.write(A[j][i]);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}