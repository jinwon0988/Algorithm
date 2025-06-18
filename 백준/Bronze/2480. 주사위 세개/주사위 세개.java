import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[3];
		for (int i = 0; i < 3; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		if (A[0] == A[1] && A[0] == A[2]) {
			bw.write(10000 + A[0] * 1000 + "\n");
		} else if (A[0] == A[1]) {
			bw.write(1000 + A[0] * 100 + "\n");
		} else if (A[1] == A[2]) {
			bw.write(1000 + A[1] * 100 + "\n");
		} else {
			bw.write(A[2] * 100 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
