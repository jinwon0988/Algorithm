import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N;
		while ((N = Integer.parseInt(br.readLine())) != -1) {
			int sum = 0;
			ArrayList<Integer> A = new ArrayList<>();
			for (int i = 1; i <= N / 2; i++) {
				if (N % i == 0) {
					sum += i;
					A.add(i);
				}
			}
			if (N == sum) {
				bw.write(N + " = ");
				for (int i = 0; i < A.size() - 1; i++) {
					bw.write(A.get(i) + " + ");
				}
				bw.write(A.get(A.size() - 1) + "\n");
			} else {
				bw.write(N + " is NOT perfect.\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}