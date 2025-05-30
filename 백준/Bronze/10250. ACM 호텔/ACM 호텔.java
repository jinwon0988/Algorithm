import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int Y = (N % H == 0) ? H : (N % H);
			int X = (N % H == 0) ? (N / H) : (N / H + 1);
			bw.write(Y + "");
			if (X < 10)
				bw.write("0" + X + "\n");
			else
				bw.write(X + "\n");
		}
		bw.flush();
		bw.close();
	}
}
