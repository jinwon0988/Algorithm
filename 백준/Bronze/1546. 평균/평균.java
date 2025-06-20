import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, A[i]);
		}
		double sum = 0.0;
		for(int i=0; i<N; i++)
			sum += A[i] / (double)max * 100;
		bw.write(sum/N + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
