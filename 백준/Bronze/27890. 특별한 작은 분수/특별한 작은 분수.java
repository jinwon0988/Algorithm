import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x0 = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			if (x0 % 2 == 0)
				x0 = (x0 / 2) ^ 6;
			else
				x0 = (2 * x0) ^ 6;
		}
		bw.write(x0 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}