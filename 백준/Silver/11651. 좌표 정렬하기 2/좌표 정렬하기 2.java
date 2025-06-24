import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		XY[] A = new XY[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			A[i] = new XY(x, y);
		}
		Arrays.sort(A, (o1, o2) -> {
			if (o1.y == o2.y)
				return Integer.compare(o1.x, o2.x);
			return Integer.compare(o1.y, o2.y);
		});
		for (int i = 0; i < N; i++) {
			bw.write(A[i].x + " " + A[i].y + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static class XY {
		int x;
		int y;

		XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}