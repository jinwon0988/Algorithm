import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			long p = Long.parseLong(st.nextToken());
			long t = Long.parseLong(st.nextToken());
			p -= t / 7;
			p += t / 4;
			bw.write(p + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}