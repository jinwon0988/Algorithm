import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x1 = Integer.parseInt(st.nextToken());
		long y1 = Integer.parseInt(st.nextToken());
		long x2 = Integer.parseInt(st.nextToken());
		long y2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long x3 = Integer.parseInt(st.nextToken());
		long y3 = Integer.parseInt(st.nextToken());
		long x4 = Integer.parseInt(st.nextToken());
		long y4 = Integer.parseInt(st.nextToken());
		boolean cross = isCross(x1, y1, x2, y2, x3, y3, x4, y4);
		if (cross)
			bw.write("1\n");
		else
			bw.write("0\n");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int CCW(long x1, long y1, long x2, long y2, long x3, long y3) {
		long temp = (x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3);
		if (temp > 0)
			return 1;
		else if (temp < 0)
			return -1;
		else
			return 0;
	}

	public static boolean isOverlab(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
		if (Math.min(x1, x2) <= Math.max(x3, x4) && Math.min(x3, x4) <= Math.max(x1, x2)
				&& Math.min(y1, y2) <= Math.max(y3, y4) && Math.min(y3, y4) <= Math.max(y1, y2))
			return true;
		else
			return false;
	}

	public static boolean isCross(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
		int abc = CCW(x1, y1, x2, y2, x3, y3);
		int abd = CCW(x1, y1, x2, y2, x4, y4);
		int cda = CCW(x3, y3, x4, y4, x1, y1);
		int cdb = CCW(x3, y3, x4, y4, x2, y2);
		if (abc * abd == 0 && cda * cdb == 0) {
			return isOverlab(x1, y1, x2, y2, x3, y3, x4, y4);
		} else if (abc * abd <= 0 && cda * cdb <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
