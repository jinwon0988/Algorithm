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
			int max = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[max] < A[j]) {
					max = j;
				}
			}
			if (A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}
		for (int i = 0; i < A.length; i++) {
			bw.write(A[i] + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
