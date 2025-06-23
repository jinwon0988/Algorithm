import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[201];
		for (int i = 0; i < N; i++) {
			A[Integer.parseInt(st.nextToken()) + 100]++;
		}
		int V = Integer.parseInt(br.readLine()) + 100;
		bw.write(A[V] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}