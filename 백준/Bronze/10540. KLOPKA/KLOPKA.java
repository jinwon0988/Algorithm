import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int minX = 100;
		int minY = 100;
		int maxX = 0;
		int maxY = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			maxX = Math.max(maxX, X);
			maxY = Math.max(maxY, Y);
			minX = Math.min(minX, X);
			minY = Math.min(minY, Y);
		}
		int side = Math.max(maxX - minX, maxY - minY);
		bw.write((side * side) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}