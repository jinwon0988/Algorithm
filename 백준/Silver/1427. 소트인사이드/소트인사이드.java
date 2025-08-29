import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int[] A = new int[input.length()];
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(input.substring(i, i + 1));
		}
		for (int i = 0; i < A.length; i++) {
			int maxIdx = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[maxIdx] < A[j]) {
					maxIdx = j;
				}
			}
			if (A[i] < A[maxIdx]) {
				int temp = A[i];
				A[i] = A[maxIdx];
				A[maxIdx] = temp;
			}
		}
		for (int i : A) {
			bw.write(i + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}