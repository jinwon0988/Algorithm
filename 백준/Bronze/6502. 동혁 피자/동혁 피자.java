import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int order = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			double r = Double.parseDouble(st.nextToken());
			if (r == 0.0)
				break;
			double w = Double.parseDouble(st.nextToken());
			double l = Double.parseDouble(st.nextToken());
			w /= 2.0;
			l /= 2.0;
			if (r * r >= w * w + l * l) {
				bw.write("Pizza " + order + " fits on the table.\n");
			} else {
				bw.write("Pizza " + order + " does not fit on the table.\n");
			}
			order++;
		}
		bw.close();
		br.close();
	}
}