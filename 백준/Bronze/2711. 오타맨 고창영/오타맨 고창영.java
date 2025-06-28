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
			int index = Integer.parseInt(st.nextToken()) - 1;
			String str = st.nextToken();
			for (int j = 0; j < str.length(); j++) {
				if (j == index)
					continue;
				bw.write(str.charAt(j) + "");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}