import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] A = new int[26][2];
		String input = br.readLine();
		for (int i = 0; i < 26; i++) {
			A[i][0] = i;
		}
		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i) - 65;
			if (index >= 32)
				index -= 32;
			A[index][1]++;
		}
		Arrays.sort(A, (o1, o2) -> {
			if (o1[1] == o2[1])
				return Integer.compare(o1[0], o2[0]);
			return Integer.compare(o2[1], o1[1]);
		});
		if (A[0][1] == A[1][1])
			bw.write("?\n");
		else
			bw.write((char) (A[0][0] + 65) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}