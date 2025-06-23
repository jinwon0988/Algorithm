import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int R = Integer.parseInt(st.nextToken()) * 2126;
				int G = Integer.parseInt(st.nextToken()) * 7152;
				int B = Integer.parseInt(st.nextToken()) * 722;
				int sum = R + G + B;
				if (sum < 510000)
					bw.write("#");
				else if (sum < 1020000)
					bw.write("o");
				else if (sum < 1530000)
					bw.write("+");
				else if (sum < 2040000)
					bw.write("-");
				else
					bw.write(".");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}