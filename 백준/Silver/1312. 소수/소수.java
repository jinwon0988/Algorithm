import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		A %= B;
		int res = 0;
		for (int i = 0; i < N; i++) {
			A *= 10;
			res = A / B;
			A %= B;
		}
		bw.write(res + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}