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
		if (A[0] + A[1] <= A[2]) {
			A[2] = A[0] + A[1] - 1;
			bw.write(A[0] + A[1] + A[2] + "\n");
		} else {
			bw.write(A[0] + A[1] + A[2] + "\n");
		}
		bw.close();
		br.close();
	}
}