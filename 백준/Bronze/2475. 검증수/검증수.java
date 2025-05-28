import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] N = new int[5];
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for (int i = 0; i < N.length; i++) {
			sum += N[i] * N[i];
		}
		bw.write(sum % 10 + "\n");
		bw.flush();
		bw.close();
	}
}
