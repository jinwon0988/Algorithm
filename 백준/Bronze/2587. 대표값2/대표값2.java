import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] A = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			A[i] = Integer.parseInt(br.readLine());
			sum += A[i];
		}
		bw.write(sum / 5 + "\n");
		Arrays.sort(A);
		bw.write(A[2] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}