import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int Y = 0;
		int M = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int time = Integer.parseInt(st.nextToken());
			Y += (time / 30 + 1) * 10;
			M += (time / 60 + 1) * 15;
		}
		if (Y == M)
			bw.write("Y M " + Y + "\n");
		else if (Y < M)
			bw.write("Y " + Y + "\n");
		else {
			bw.write("M " + M + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}