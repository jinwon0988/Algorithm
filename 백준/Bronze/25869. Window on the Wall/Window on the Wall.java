import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int result = 0;
		if (w > 2 * d && h > 2 * d) {
			w -= 2 * d;
			h -= 2 * d;
			result = w * h;
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}